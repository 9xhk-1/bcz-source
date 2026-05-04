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
@Entity(tableName = "t_assemble_behaviour_record")
@Keep
/* loaded from: classes4.dex */
public final class AssembleBehaviourRecord {
    public static final int $stable = 0;

    @ColumnInfo(name = "behaviour")
    @k
    private final AssembleBehaviourType behaviour;

    @ColumnInfo(name = "create_at")
    private final long createAt;

    /* renamed from: id, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private final long f16442id;

    @ColumnInfo(name = "question_type")
    @k
    private final String questionType;

    public AssembleBehaviourRecord(long j11, @k String questionType, @k AssembleBehaviourType behaviour, long j12) {
        g0.p(questionType, "questionType");
        g0.p(behaviour, "behaviour");
        this.f16442id = j11;
        this.questionType = questionType;
        this.behaviour = behaviour;
        this.createAt = j12;
    }

    public static /* synthetic */ AssembleBehaviourRecord copy$default(AssembleBehaviourRecord assembleBehaviourRecord, long j11, String str, AssembleBehaviourType assembleBehaviourType, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = assembleBehaviourRecord.f16442id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            str = assembleBehaviourRecord.questionType;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            assembleBehaviourType = assembleBehaviourRecord.behaviour;
        }
        AssembleBehaviourType assembleBehaviourType2 = assembleBehaviourType;
        if ((i11 & 8) != 0) {
            j12 = assembleBehaviourRecord.createAt;
        }
        return assembleBehaviourRecord.copy(j13, str2, assembleBehaviourType2, j12);
    }

    public final long component1() {
        return this.f16442id;
    }

    @k
    public final String component2() {
        return this.questionType;
    }

    @k
    public final AssembleBehaviourType component3() {
        return this.behaviour;
    }

    public final long component4() {
        return this.createAt;
    }

    @k
    public final AssembleBehaviourRecord copy(long j11, @k String questionType, @k AssembleBehaviourType behaviour, long j12) {
        g0.p(questionType, "questionType");
        g0.p(behaviour, "behaviour");
        return new AssembleBehaviourRecord(j11, questionType, behaviour, j12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssembleBehaviourRecord)) {
            return false;
        }
        AssembleBehaviourRecord assembleBehaviourRecord = (AssembleBehaviourRecord) obj;
        return this.f16442id == assembleBehaviourRecord.f16442id && g0.g(this.questionType, assembleBehaviourRecord.questionType) && this.behaviour == assembleBehaviourRecord.behaviour && this.createAt == assembleBehaviourRecord.createAt;
    }

    @k
    public final AssembleBehaviourType getBehaviour() {
        return this.behaviour;
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    public final long getId() {
        return this.f16442id;
    }

    @k
    public final String getQuestionType() {
        return this.questionType;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f16442id) * 31) + this.questionType.hashCode()) * 31) + this.behaviour.hashCode()) * 31) + Long.hashCode(this.createAt);
    }

    @k
    public String toString() {
        return "AssembleBehaviourRecord(id=" + this.f16442id + ", questionType=" + this.questionType + ", behaviour=" + this.behaviour + ", createAt=" + this.createAt + j.f81007d;
    }

    public /* synthetic */ AssembleBehaviourRecord(long j11, String str, AssembleBehaviourType assembleBehaviourType, long j12, int i11, v vVar) {
        this((i11 & 1) != 0 ? 0L : j11, str, assembleBehaviourType, (i11 & 8) != 0 ? System.currentTimeMillis() : j12);
    }
}
