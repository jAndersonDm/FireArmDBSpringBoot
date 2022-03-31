/**
 * @author ${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Fall 2021
 * ${3/28/2022}
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dmacc.beans.gunInfo;

public interface gunRepository extends JpaRepository<gunInfo, Long> {

}
