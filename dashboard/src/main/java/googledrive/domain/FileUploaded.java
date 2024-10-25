package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String filetype;
    private String filename;
    private Integer filesize;
    private String userid;
    private Date uploaddt;
}
