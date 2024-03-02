package application.movietheater.auth.Token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = """
      SELECT t FROM Token t INNER JOIN AppUser u
      ON t.appUser.userId = u.userId
      WHERE u.userId = :id 
      AND (t.expired = FALSE OR t.revoked = FALSE)
      """)
    List<Token> findAllValidTokenByUser(Integer id);

    Optional<Token> findByToken(String token);
}