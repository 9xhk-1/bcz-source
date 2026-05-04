package jj;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Dao
/* loaded from: classes5.dex */
public interface a {
    @m80.l
    @Query("SELECT * FROM word_books")
    Object b(@m80.k j00.c<? super List<kj.a>> cVar);

    @Query("SELECT * FROM word_books")
    @m80.k
    kotlinx.coroutines.flow.i<List<kj.a>> c();

    @m80.l
    @Query("SELECT * FROM word_books WHERE id = :bookId")
    Object d(long j11, @m80.k j00.c<? super kj.a> cVar);

    @Query("SELECT * FROM word_books WHERE id = :bookId")
    @m80.k
    kotlinx.coroutines.flow.i<kj.a> e(long j11);

    @Insert(onConflict = 1)
    @m80.l
    Object f(@m80.k kj.a aVar, @m80.k j00.c<? super g2> cVar);

    @Update
    @m80.l
    Object g(@m80.k kj.a aVar, @m80.k j00.c<? super g2> cVar);

    @m80.l
    @Query("DELETE FROM word_books WHERE id = :bookId")
    Object h(long j11, @m80.k j00.c<? super g2> cVar);

    @m80.l
    @Query("UPDATE word_books SET wordCount = (SELECT wordCount FROM word_books WHERE id = :bookId) + :changedCount, updatedAt = CASE WHEN :updatedAt = 0 THEN updatedAt ELSE :updatedAt END WHERE id = :bookId")
    Object i(long j11, int i11, long j12, @m80.k j00.c<? super g2> cVar);
}
