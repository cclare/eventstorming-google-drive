package googledrive.domain;

import googledrive.domain.FileUploaded;
import googledrive.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Drive_table")
@Data

//<<< DDD / Aggregate Root
public class Drive  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private String filename;
    
    
    
    
    private Integer filesize;
    
    
    
    
    private String userid;
    
    
    
    
    private Date uploaddt;
    
    
    
    @Embedded
    private  class392;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    
    }

    public static DriveRepository repository(){
        DriveRepository driveRepository = DriveApplication.applicationContext.getBean(DriveRepository.class);
        return driveRepository;
    }






}
//>>> DDD / Aggregate Root
