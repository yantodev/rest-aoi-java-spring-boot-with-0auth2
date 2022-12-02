package com.yantodev.api.model.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class AAuditTable {

    @JsonIgnore
    @CreatedBy
    @Column(name = "created_at", updatable = false, nullable = false)
    protected Date createdAt;

    @JsonIgnore
    @CreatedDate
    @Column(name = "updated_at", nullable = false, updatable = false)
    protected Date updateAt;

    @JsonIgnore
    @CreatedDate
    @Column(name = "deleted_at", nullable = false, updatable = false)
    protected Date deletedAt;
}
