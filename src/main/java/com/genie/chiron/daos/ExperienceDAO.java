package com.genie.chiron.daos;

import com.genie.chiron.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ExperienceDAO extends JpaRepository<Experience, Integer> {

    @Query(
            value ="SELECT * FROM avatar a " +
                    "full JOIN avatar_experience ae ON a.avatar_id = ae.avatar_avatar_id " +
                    "full JOIN experience e ON e.experience_id = ae.experience_experience_id where e.date= :date AND a.avatar_id = :avatarId",
            nativeQuery = true
    )
    List<Experience> findAllExpereincesByDate(@Param("date") LocalDate date, @Param("avatarId") int avatarId);

    @Query(
            value ="SELECT * FROM avatar a " +
                    "full JOIN avatar_experience ae ON a.avatar_id = ae.avatar_avatar_id " +
                    "full JOIN experience e ON e.experience_id = ae.experience_experience_id where a.avatar_id = :avatarId",
            nativeQuery = true
    )
    List<Experience> findAllExpereincesById(@Param("avatarId") int avatarId);



//    @Query(
//            value ="SELECT * FROM transactions WHERE recepient_acct = :bankAcctId OR sender_acct = :bankAcctId",
//            nativeQuery = true
//    )
//    List<Experience> findAllTransactionsByBankAcctId(@Param("bankAcctId") int bankAcctId);
}
