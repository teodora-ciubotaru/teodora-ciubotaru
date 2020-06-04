package com.examsProject.exams.repository.provider;

import com.examsProject.exams.domain.Exam;
import com.examsProject.exams.repository.ExamRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ExamProvider implements ExamRepository {

    private final JdbcTemplate jdbcTemplate;

    ExamProvider(final JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Exam getExamById(Integer examId) {
        return jdbcTemplate.queryForObject(
                "SELECT id, classroom, \"date\", number_of_seats as \"numberOfSeats\", section, semester, study_year as \"studyYear\"," +
                        "subject_exam as \"subjectExam\", teacher, university_year as \"universityYear\" FROM exams WHERE id = ?",
                new Object[]{examId},
                (rs, rowNum) -> new Exam(
                        rs.getInt("id"),
                        rs.getString("subjectExam"),
                        rs.getString("teacher"),
                        rs.getInt("universityYear"),
                        rs.getString("section"),
                        rs.getInt("semester"),
                        rs.getInt("studyYear"),
                        rs.getString("classroom"),
                        rs.getTimestamp("date"),
                        rs.getInt("numberOfSeats")
                )
        );
    }

    @Override
    public List<Map<String, Object>> getAllExams() {
        return jdbcTemplate.queryForList(
                "SELECT id, classroom, \"date\", number_of_seats as \"numberOfSeats\", section, semester, study_year as \"studyYear\"," +
                        "subject_exam as \"subjectExam\", teacher, university_year as \"universityYear\" FROM exams"
        );
    }

    @Override
    public void updateExam(Integer id, String date, Integer numberOfSeats, String classroom) {
        jdbcTemplate.update(
                "UPDATE exams SET number_of_seats=?, classroom=? WHERE id = ?",
                numberOfSeats, classroom, id
        );
    }

    @Override
    public void deleteExamById(Integer id) {
        jdbcTemplate.update(
                "DELETE FROM exams WHERE id = ?",
                 id
        );
    }

    @Override
    public void insertExam(
            Integer universityYear,
            Integer studyYear,
            String section,
            Integer numberOfSeats,
            String subjectExam,
            String teacher,
            String classroom,
            Integer semester) {
        jdbcTemplate.update(
                "INSERT INTO exams (university_year, study_year, section, number_of_seats," +
                        " subject_exam, teacher, classroom, semester, \"date\") VALUES" +
                        "           (?,?,?,?,?,?,?,?,NOW())" ,
                universityYear,
                studyYear,
                section,
                numberOfSeats,
                subjectExam,
                teacher,
                classroom,
                semester
        );
    }
}
