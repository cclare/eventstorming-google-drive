package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String url;
    private String userid;
    private Date processdt;
}
