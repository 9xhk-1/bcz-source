package w9;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.baicizhan.client.business.managers.experience.data.db.AssembleBehaviourRecord;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Dao
/* loaded from: classes4.dex */
public interface a {
    @Query("delete from t_assemble_behaviour_record")
    int a();

    @Insert(onConflict = 1)
    long b(@m80.k AssembleBehaviourRecord assembleBehaviourRecord);

    @Delete
    int c(@m80.k List<AssembleBehaviourRecord> list);

    @Query("select * from t_assemble_behaviour_record")
    @m80.k
    List<AssembleBehaviourRecord> d();
}
