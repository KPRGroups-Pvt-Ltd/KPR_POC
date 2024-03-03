/**
 * @author rajukshirsagar
 * @package com.example.openApiDoc.config
 * @date 03/03/24
 * @time 4:15 PM
 * @month Mar
 * @year 2024
 * @emailID raju.kshirsagar151@gmail.com
 */

package com.example.openApiDoc.repo;

import com.example.openApiDoc.modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository <Book, Long>{

    Book findAllById(long id);

    void deleteById(long id);
}
