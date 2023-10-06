package github.carfesal.contentcalendar.repositories;

import github.carfesal.contentcalendar.models.Content;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContentJDBCTemplateRepository {
//    private final JdbcTemplate jdbcTemplate;
//
//    public ContentJDBCTemplateRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    private static Content mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Content(
//                rs.getInt( "id"),
//                rs.getString( "title"),
//                rs.getString( "description"),
//                rs.getString( "status"),
//                rs.getString( "content_type"),
//                rs.getTimestamp( "created_at"),
//                rs.getTimestamp( "updated_at"),
//                rs.getString( "url")
//        );
//    }
//
//    public List<Content> getAllContent(){
//        String sql = "SELECT * FROM content";
//
//        return jdbcTemplate.query(sql, ContentJDBCTemplateRepository::mapRow);
//    }
//
//    public void createContent(
//            String title,
//            String description,
//            String status,
//            String content_type,
//            String created_at,
//            String updated_at,
//            String url
//    ){
//        String sql = "INSERT INTO content(title, description, status, content_type, created_at, url) " +
//                "VALUES(?, ?, ?, ?, NOW(), ?)";
//        jdbcTemplate.update(sql, title,description,status, content_type, url);
//    }
//
//    public void updateContent(
//            int id,
//            String title,
//            String description,
//            String status,
//            String content_type,
//            String created_at,
//            String updated_at,
//            String url
//    ){
//        String sql = "UPDATE content " +
//                "SET title=?, description=?, status=?, content_type=?, updated_at=NOW(), url=? " +
//                "WHERE id=?";
//        jdbcTemplate.update(sql, title,description,status, content_type, url, id);
//    }
//
//    public void delete(int id){
//        String sql = "DELETE FROM content where id=?";
//        jdbcTemplate.update(sql, id);
//    }
//
//    public Content getContentBy(int id){
//        String sql = "SELECT * FROM content WHERE id=?";
//        return jdbcTemplate.queryForObject(sql, new Object[]{id}, ContentJDBCTemplateRepository::mapRow);
//    }
}
