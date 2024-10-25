package googledrive.domain;

import googledrive.VideoProcessingApplication;
import googledrive.domain.VideoStreamed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
//<<< DDD / Aggregate Root
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    private String url;

    private String userid;

    private Date processdt;

    @PostPersist
    public void onPostPersist() {
        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ifVideoProcessStreaming(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        VideoStreamed videoStreamed = new VideoStreamed(video);
        videoStreamed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);

            VideoStreamed videoStreamed = new VideoStreamed(video);
            videoStreamed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
