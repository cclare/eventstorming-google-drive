package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String url;
    private String userid;
    private Date processdt;

    public VideoStreamed(Video aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}
//>>> DDD / Domain Event
