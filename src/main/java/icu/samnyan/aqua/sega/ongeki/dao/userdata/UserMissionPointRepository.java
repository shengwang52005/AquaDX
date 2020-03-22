package icu.samnyan.aqua.sega.ongeki.dao.userdata;

import icu.samnyan.aqua.sega.ongeki.model.userdata.UserData;
import icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint;
import icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author samnyan (privateamusement@protonmail.com)
 */
@Repository("OngekiUserMissionPointRepository")
public interface UserMissionPointRepository extends JpaRepository<UserMissionPoint, Long> {
    Optional<UserMissionPoint> findByUserAndEventId(UserData userData, int eventId);

    List<UserMissionPoint> findByUser_Card_ExtId(int userId);
}
