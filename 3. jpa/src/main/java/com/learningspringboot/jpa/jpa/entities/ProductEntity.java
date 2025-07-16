package com.learningspringboot.jpa.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "product_table",
        uniqueConstraints = {

                // @UniqueConstraint automatically create indexes in most relational db.
                // we clubbed the two columns for unique constraints, now same title with different price
                // can exist but same title with same price won't.
                @UniqueConstraint(name = "title_price_unique",columnNames = {"title_x","price"})
        },
        indexes = {
                @Index(name = "sku_index",columnList = "sku")
        }
        // Reason behind some dropping and adding in terminal what Hibernate is doing:
        //It's Hibernate being defensive and careful:
        //MySQL (and some other DBs) reuse the same name for indexes and constraints.
        //Hibernate wants to avoid name conflicts.
        //Even if an index doesn't exist yet, Hibernate safely tries to drop before adding.
        //You could think of it like: “Hibernate always resets constraints to ensure schema consistency.”
)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 20)
    private String sku;

    @Column(name = "title_x")
    private String title;

    private BigDecimal price;

    private Integer quantity;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
