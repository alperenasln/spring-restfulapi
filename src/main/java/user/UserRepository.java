package user;

//-----------------------------------------------------
//Title: UserRepository
//Author:Alperen Aslan
//Definition : This class is interface for repository of user.
//Resource : https://spring.io/guides/tutorials/rest/
//------------------------------------------------------
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {

}