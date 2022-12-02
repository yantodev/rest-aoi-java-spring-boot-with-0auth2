package com.yantodev.api.dto.response.pkl.teacher;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseTeacherDto implements Serializable {
    private static final long serialVersionUid = 323545336569L;

    private Long userPublicId;
    private String name;
    private Long nbm;
    private String email;
    private String position;
    private String hp;
}