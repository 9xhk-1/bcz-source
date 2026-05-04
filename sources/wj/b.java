package wj;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord;
import java.util.Collection;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Dao
/* loaded from: classes5.dex */
public interface b {
    @Query("SELECT * FROM t_wordlist_resource_record WHERE book_id = :bookId AND topic_id IN (:topicIds)")
    @k
    List<WordListResourceRecord> a(int i11, @k Collection<Integer> collection);

    @Query("select * from t_wordlist_resource_record where book_id = :bookId")
    @k
    List<WordListResourceRecord> b(int i11);

    @Insert(onConflict = 1)
    @k
    List<Long> c(@k List<WordListResourceRecord> list);
}
