package com.learningSpringBoot.mvcs.mvcs.services;

import com.learningSpringBoot.mvcs.mvcs.dto.EmployeeDTO;
import com.learningSpringBoot.mvcs.mvcs.entities.EmployeeEntity;
import com.learningSpringBoot.mvcs.mvcs.exceptions.ResourceNotFoundException;
import com.learningSpringBoot.mvcs.mvcs.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }


    public Optional<EmployeeDTO> getEmployeeById(Long id) {
//        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(id);
//        return employeeEntity.map(employeeEntity1 -> modelMapper.map(employeeEntity1,EmployeeDTO.class));
        return employeeRepository.findById(id).map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class));
    }

    public List<EmployeeDTO> findAll() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO inputEmployee) {
        EmployeeEntity toSaveEntity = modelMapper.map(inputEmployee,EmployeeEntity.class);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(toSaveEntity);
        return modelMapper.map(savedEmployeeEntity,EmployeeDTO.class);
    }
    public boolean isExistsByEmployeeId(Long employeeId){
        boolean exists = employeeRepository.existsById(employeeId);
        if(!exists) throw new ResourceNotFoundException("Employee not found with id: "+employeeId);
        return true;
    }

    public EmployeeDTO updateEmployeeById(Long employeeId, EmployeeDTO employeeDTO) {
        isExistsByEmployeeId(employeeId);
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO,EmployeeEntity.class);
        employeeEntity.setId(employeeId);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(employeeEntity);
        return modelMapper.map(savedEmployeeEntity,EmployeeDTO.class);
    }


    public boolean deleteEmployeeById(Long employeeId){
        isExistsByEmployeeId(employeeId);
        employeeRepository.deleteById(employeeId);
        return true;
    }

    public EmployeeDTO updatePartialEmployeeById(Long employeeId, Map<String, Object> updates){
        isExistsByEmployeeId(employeeId);
        EmployeeEntity employeeEntity = employeeRepository.findById(employeeId).get();
        // field as key of the map
        updates.forEach((field,value)->{
            // extracting the current field to be updated
            Field fieldToBeUpdated = ReflectionUtils.findField(EmployeeEntity.class,field);
            // setting the access modifier to public so that it can be used as the fields are defined private
            // in the employeeEntity
            fieldToBeUpdated.setAccessible(true);

            // Setting the fieldToBeUpdated of employeeEntity with value
            ReflectionUtils.setField(fieldToBeUpdated,employeeEntity,value);
        });
        return modelMapper.map(employeeRepository.save(employeeEntity),EmployeeDTO.class);
    }
}
