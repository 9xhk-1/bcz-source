package wc;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.baicizhan.client.business.managers.experience.data.db.TaskRecord;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Dao
/* loaded from: classes4.dex */
public interface a {
    @Query("delete from t_task_record")
    int a();

    @Query("select * from t_task_record")
    @k
    List<TaskRecord> b();

    @Insert(onConflict = 5)
    long c(@k TaskRecord taskRecord);

    @Delete
    int d(@k List<TaskRecord> list);

    @Insert(onConflict = 5)
    void e(@k List<TaskRecord> list);
}
