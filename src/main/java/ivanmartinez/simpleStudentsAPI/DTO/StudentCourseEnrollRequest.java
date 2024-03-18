package ivanmartinez.simpleStudentsAPI.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentCourseEnrollRequest {
    private Long studentId;
    private Long courseId;
}