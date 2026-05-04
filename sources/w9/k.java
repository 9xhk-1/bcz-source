package w9;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.baicizhan.client.business.managers.experience.data.db.StudyBehaviour;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Dao
/* loaded from: classes4.dex */
public interface k {
    @Query("delete from t_study_behaviour")
    int a();

    @Query("select count(1) from t_study_behaviour where book_id = :bookId and topic_id = :topicId and question_type =:questionType and study_date = :today")
    int b(int i11, int i12, @m80.k String str, int i13);

    @Query("delete  from t_study_behaviour where study_date != :today")
    int c(int i11);

    @Insert(onConflict = 1)
    long d(@m80.k StudyBehaviour studyBehaviour);
}
