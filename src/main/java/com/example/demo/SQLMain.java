//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.kafka.core.KafkaTemplate;
//
//import java.security.Security;
//import java.util.List;
//
//
//@SpringBootApplication(exclude = {})
//public class SQLMain implements CommandLineRunner {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SQLMain.class, args);
//    }
////    @Bean
////    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
////        return args -> {
////            kafkaTemplate.send("amigoscode", "hello kafka");
////        };
////    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        String sql = "SELECT * FROM Customer";
//        System.out.println(jdbcTemplate.queryForObject(sql, String.class));
////        List<String> customers = jdbcTemplate.query(sql,
////                BeanPropertyRowMapper.newInstance(String.class));
////        System.out.println(customers.get(0));
////        customers.forEach(System.out::println);
//    }
//}
//
////	@Bean
////	public DefaultErrorHandler errorHandler(KafkaOperations<Object, Object> template) {
////		return new DefaultErrorHandler(
////				new DeadLetterPublishingRecoverer(template), new FixedBackOff(1000L, 2));
////	}
//
//
