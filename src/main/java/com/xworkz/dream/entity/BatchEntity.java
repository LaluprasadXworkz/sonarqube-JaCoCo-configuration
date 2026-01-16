package com.xworkz.dream.entity;

import com.xworkz.dream.entity.audit.AuditEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "batch_info")
@Getter
@Setter
@NoArgsConstructor
public class BatchEntity extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "batch_name", nullable = false)
    private String batchName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "batch_type")
    private String batchType;

    @Column(name = "trainer")
    private String trainer;

    @Column(name = "branch")
    private String branch;

    @Column(name = "whatsapp_link")
    private String whatsappLink;

    @Column(name = "total_class")
    private Integer totalClass;

    @Column(name = "is_deleted", nullable = false)
    private Boolean deleted = false;
}
