package com.baicizhan.client.business.managers.experience.data.db;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Entity(tableName = "t_study_behaviour")
@Keep
/* loaded from: classes4.dex */
public final class StudyBehaviour {
    public static final int $stable = 0;

    @ColumnInfo(name = "book_id")
    private final int bookId;

    @ColumnInfo(name = "create_at")
    private final long createAt;

    /* renamed from: id, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private final long f16449id;

    @ColumnInfo(name = "question_type")
    @k
    private final String questionType;

    @ColumnInfo(name = "study_date")
    private final int studyDate;

    @ColumnInfo(name = "topic_id")
    private final int topicId;

    public StudyBehaviour(long j11, int i11, int i12, @k String questionType, int i13, long j12) {
        g0.p(questionType, "questionType");
        this.f16449id = j11;
        this.bookId = i11;
        this.topicId = i12;
        this.questionType = questionType;
        this.studyDate = i13;
        this.createAt = j12;
    }

    public static /* synthetic */ StudyBehaviour copy$default(StudyBehaviour studyBehaviour, long j11, int i11, int i12, String str, int i13, long j12, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j11 = studyBehaviour.f16449id;
        }
        long j13 = j11;
        if ((i14 & 2) != 0) {
            i11 = studyBehaviour.bookId;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            i12 = studyBehaviour.topicId;
        }
        int i16 = i12;
        if ((i14 & 8) != 0) {
            str = studyBehaviour.questionType;
        }
        String str2 = str;
        if ((i14 & 16) != 0) {
            i13 = studyBehaviour.studyDate;
        }
        return studyBehaviour.copy(j13, i15, i16, str2, i13, (i14 & 32) != 0 ? studyBehaviour.createAt : j12);
    }

    public final long component1() {
        return this.f16449id;
    }

    public final int component2() {
        return this.bookId;
    }

    public final int component3() {
        return this.topicId;
    }

    @k
    public final String component4() {
        return this.questionType;
    }

    public final int component5() {
        return this.studyDate;
    }

    public final long component6() {
        return this.createAt;
    }

    @k
    public final StudyBehaviour copy(long j11, int i11, int i12, @k String questionType, int i13, long j12) {
        g0.p(questionType, "questionType");
        return new StudyBehaviour(j11, i11, i12, questionType, i13, j12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudyBehaviour)) {
            return false;
        }
        StudyBehaviour studyBehaviour = (StudyBehaviour) obj;
        return this.f16449id == studyBehaviour.f16449id && this.bookId == studyBehaviour.bookId && this.topicId == studyBehaviour.topicId && g0.g(this.questionType, studyBehaviour.questionType) && this.studyDate == studyBehaviour.studyDate && this.createAt == studyBehaviour.createAt;
    }

    public final int getBookId() {
        return this.bookId;
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    public final long getId() {
        return this.f16449id;
    }

    @k
    public final String getQuestionType() {
        return this.questionType;
    }

    public final int getStudyDate() {
        return this.studyDate;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f16449id) * 31) + Integer.hashCode(this.bookId)) * 31) + Integer.hashCode(this.topicId)) * 31) + this.questionType.hashCode()) * 31) + Integer.hashCode(this.studyDate)) * 31) + Long.hashCode(this.createAt);
    }

    @k
    public String toString() {
        return "StudyBehaviour(id=" + this.f16449id + ", bookId=" + this.bookId + ", topicId=" + this.topicId + ", questionType=" + this.questionType + ", studyDate=" + this.studyDate + ", createAt=" + this.createAt + j.f81007d;
    }

    public /* synthetic */ StudyBehaviour(long j11, int i11, int i12, String str, int i13, long j12, int i14, v vVar) {
        this((i14 & 1) != 0 ? 0L : j11, (i14 & 2) != 0 ? 0 : i11, i12, str, i13, (i14 & 32) != 0 ? System.currentTimeMillis() : j12);
    }
}
