/**
 * @author rajukshirsagar
 * @package com.example.openApiDoc.config
 * @date 03/03/24
 * @time 4:15 PM
 * @month Mar
 * @year 2024
 * @emailID raju.kshirsagar151@gmail.com
 */
package com.example.securingweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private String roles;

}
