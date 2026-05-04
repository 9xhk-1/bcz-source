package com.baicizhan.main.wordlistv2.repo.db;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Entity(indices = {@Index(unique = true, value = {"book_id", "topic_id"})}, primaryKeys = {"book_id", "topic_id"}, tableName = "t_wordlist_resource_record")
@Keep
/* loaded from: classes5.dex */
public final class WordListResourceRecord {
    public static final int $stable = 0;

    @ColumnInfo(name = "audio_usa_uri")
    @k
    private final String accentUsaAudioUri;

    @ColumnInfo(name = "book_id")
    private final int bookId;

    @ColumnInfo(name = a.e.C0246a.f16184d)
    @k
    private final String meanCn;

    @ColumnInfo(name = "topic_id")
    private final int topicId;

    @ColumnInfo(name = "word")
    @k
    private final String word;

    public WordListResourceRecord(int i11, int i12, @k String word, @k String meanCn, @k String accentUsaAudioUri) {
        g0.p(word, "word");
        g0.p(meanCn, "meanCn");
        g0.p(accentUsaAudioUri, "accentUsaAudioUri");
        this.bookId = i11;
        this.topicId = i12;
        this.word = word;
        this.meanCn = meanCn;
        this.accentUsaAudioUri = accentUsaAudioUri;
    }

    public static /* synthetic */ WordListResourceRecord copy$default(WordListResourceRecord wordListResourceRecord, int i11, int i12, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = wordListResourceRecord.bookId;
        }
        if ((i13 & 2) != 0) {
            i12 = wordListResourceRecord.topicId;
        }
        if ((i13 & 4) != 0) {
            str = wordListResourceRecord.word;
        }
        if ((i13 & 8) != 0) {
            str2 = wordListResourceRecord.meanCn;
        }
        if ((i13 & 16) != 0) {
            str3 = wordListResourceRecord.accentUsaAudioUri;
        }
        String str4 = str3;
        String str5 = str;
        return wordListResourceRecord.copy(i11, i12, str5, str2, str4);
    }

    public final int component1() {
        return this.bookId;
    }

    public final int component2() {
        return this.topicId;
    }

    @k
    public final String component3() {
        return this.word;
    }

    @k
    public final String component4() {
        return this.meanCn;
    }

    @k
    public final String component5() {
        return this.accentUsaAudioUri;
    }

    @k
    public final WordListResourceRecord copy(int i11, int i12, @k String word, @k String meanCn, @k String accentUsaAudioUri) {
        g0.p(word, "word");
        g0.p(meanCn, "meanCn");
        g0.p(accentUsaAudioUri, "accentUsaAudioUri");
        return new WordListResourceRecord(i11, i12, word, meanCn, accentUsaAudioUri);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordListResourceRecord)) {
            return false;
        }
        WordListResourceRecord wordListResourceRecord = (WordListResourceRecord) obj;
        return this.bookId == wordListResourceRecord.bookId && this.topicId == wordListResourceRecord.topicId && g0.g(this.word, wordListResourceRecord.word) && g0.g(this.meanCn, wordListResourceRecord.meanCn) && g0.g(this.accentUsaAudioUri, wordListResourceRecord.accentUsaAudioUri);
    }

    @k
    public final String getAccentUsaAudioUri() {
        return this.accentUsaAudioUri;
    }

    public final int getBookId() {
        return this.bookId;
    }

    @k
    public final String getMeanCn() {
        return this.meanCn;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    @k
    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.bookId) * 31) + Integer.hashCode(this.topicId)) * 31) + this.word.hashCode()) * 31) + this.meanCn.hashCode()) * 31) + this.accentUsaAudioUri.hashCode();
    }

    @k
    public String toString() {
        return "WordListResourceRecord(bookId=" + this.bookId + ", topicId=" + this.topicId + ", word=" + this.word + ", meanCn=" + this.meanCn + ", accentUsaAudioUri=" + this.accentUsaAudioUri + j.f81007d;
    }
}
