package esboot.domain

import io.ebean.Model
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Book : Model() {
    @Id
    var id: Long = 0

    var title: String = "UNKNOWN"

    var isbn: String = ""

    var created_at: LocalDateTime = LocalDateTime.now()

    var updated_at: LocalDateTime = LocalDateTime.now()
}
