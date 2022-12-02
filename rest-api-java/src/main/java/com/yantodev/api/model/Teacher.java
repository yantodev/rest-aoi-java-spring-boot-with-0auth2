package com.yantodev.api.model;

import com.yantodev.api.model.base.AAuditTable;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teacher")
public class Teacher extends AAuditTable implements Serializable {
    private static final long serialVersionUID = -3816671716148527290L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    String email;

    @Column(name = "name")
    String name;

    @Column(name = "nbm")
    Long nbm;

    @Column(name = "hp")
    String hp;

    @Column(name = "position")
    String position;
}
