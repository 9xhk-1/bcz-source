package com.baicizhan.online.playground_api;

import at.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.a;
import ts.e;
import ts.f;
import w00.g;
import ws.d;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class LavaquestGameInfo implements e {

    @g
    public final long cool_down_time;

    @g
    public final long end_time;

    @g
    public final long game_session_id;

    @g
    @k
    public final String icon_pic;

    @g
    @k
    public final String name;

    @g
    public final int status;

    @g
    @k
    public final String theme_pic;

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public static final a<LavaquestGameInfo, Builder> ADAPTER = new LavaquestGameInfoAdapter();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLavaquestGameInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LavaquestGameInfo.kt\ncom/baicizhan/online/playground_api/LavaquestGameInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
    public static final class Builder implements f<LavaquestGameInfo> {

        @l
        private Long cool_down_time;

        @l
        private Long end_time;

        @l
        private Long game_session_id;

        @l
        private String icon_pic;

        @l
        private String name;

        @l
        private Integer status;

        @l
        private String theme_pic;

        public Builder() {
            this.icon_pic = null;
            this.name = null;
            this.theme_pic = null;
            this.end_time = null;
            this.status = null;
            this.cool_down_time = null;
            this.game_session_id = null;
        }

        @k
        public final Builder cool_down_time(long j11) {
            this.cool_down_time = Long.valueOf(j11);
            return this;
        }

        @k
        public final Builder end_time(long j11) {
            this.end_time = Long.valueOf(j11);
            return this;
        }

        @k
        public final Builder game_session_id(long j11) {
            this.game_session_id = Long.valueOf(j11);
            return this;
        }

        @k
        public final Builder icon_pic(@k String icon_pic) {
            g0.p(icon_pic, "icon_pic");
            this.icon_pic = icon_pic;
            return this;
        }

        @k
        public final Builder name(@k String name) {
            g0.p(name, "name");
            this.name = name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.icon_pic = null;
            this.name = null;
            this.theme_pic = null;
            this.end_time = null;
            this.status = null;
            this.cool_down_time = null;
            this.game_session_id = null;
        }

        @k
        public final Builder status(int i11) {
            this.status = Integer.valueOf(i11);
            return this;
        }

        @k
        public final Builder theme_pic(@k String theme_pic) {
            g0.p(theme_pic, "theme_pic");
            this.theme_pic = theme_pic;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ts.f
        @k
        public LavaquestGameInfo build() {
            String str = this.icon_pic;
            if (str == null) {
                throw new IllegalStateException("Required field 'icon_pic' is missing");
            }
            String str2 = this.name;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            String str3 = this.theme_pic;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'theme_pic' is missing");
            }
            Long l11 = this.end_time;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'end_time' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.status;
            if (num == null) {
                throw new IllegalStateException("Required field 'status' is missing");
            }
            int intValue = num.intValue();
            Long l12 = this.cool_down_time;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'cool_down_time' is missing");
            }
            long longValue2 = l12.longValue();
            Long l13 = this.game_session_id;
            if (l13 != null) {
                return new LavaquestGameInfo(str, str2, str3, longValue, intValue, longValue2, l13.longValue());
            }
            throw new IllegalStateException("Required field 'game_session_id' is missing");
        }

        public Builder(@k LavaquestGameInfo source) {
            g0.p(source, "source");
            this.icon_pic = source.icon_pic;
            this.name = source.name;
            this.theme_pic = source.theme_pic;
            this.end_time = Long.valueOf(source.end_time);
            this.status = Integer.valueOf(source.status);
            this.cool_down_time = Long.valueOf(source.cool_down_time);
            this.game_session_id = Long.valueOf(source.game_session_id);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LavaquestGameInfoAdapter implements a<LavaquestGameInfo, Builder> {
        @Override // ts.a
        public void write(@k i protocol, @k LavaquestGameInfo struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("LavaquestGameInfo");
            protocol.Q6("icon_pic", 1, (byte) 11);
            protocol.p1(struct.icon_pic);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.name);
            protocol.N2();
            protocol.Q6("theme_pic", 3, (byte) 11);
            protocol.p1(struct.theme_pic);
            protocol.N2();
            protocol.Q6("end_time", 4, (byte) 10);
            protocol.q7(struct.end_time);
            protocol.N2();
            protocol.Q6("status", 5, (byte) 8);
            protocol.l5(struct.status);
            protocol.N2();
            protocol.Q6("cool_down_time", 6, (byte) 10);
            protocol.q7(struct.cool_down_time);
            protocol.N2();
            protocol.Q6("game_session_id", 7, (byte) 10);
            protocol.q7(struct.game_session_id);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ts.a
        @k
        public LavaquestGameInfo read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new Builder());
        }

        @Override // ts.a
        @k
        public LavaquestGameInfo read(@k i protocol, @k Builder builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return builder.build();
                }
                switch (a62.f96797c) {
                    case 1:
                        if (b11 == 11) {
                            builder.icon_pic(protocol.readString());
                            break;
                        } else {
                            b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            builder.name(protocol.readString());
                            break;
                        } else {
                            b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 11) {
                            builder.theme_pic(protocol.readString());
                            break;
                        } else {
                            b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 10) {
                            builder.end_time(protocol.T1());
                            break;
                        } else {
                            b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.status(protocol.s8());
                            break;
                        } else {
                            b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 10) {
                            builder.cool_down_time(protocol.T1());
                            break;
                        } else {
                            b.a(protocol, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 10) {
                            builder.game_session_id(protocol.T1());
                            break;
                        } else {
                            b.a(protocol, b11);
                            break;
                        }
                    default:
                        b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }
    }

    public LavaquestGameInfo(@k String icon_pic, @k String name, @k String theme_pic, long j11, int i11, long j12, long j13) {
        g0.p(icon_pic, "icon_pic");
        g0.p(name, "name");
        g0.p(theme_pic, "theme_pic");
        this.icon_pic = icon_pic;
        this.name = name;
        this.theme_pic = theme_pic;
        this.end_time = j11;
        this.status = i11;
        this.cool_down_time = j12;
        this.game_session_id = j13;
    }

    public static /* synthetic */ LavaquestGameInfo copy$default(LavaquestGameInfo lavaquestGameInfo, String str, String str2, String str3, long j11, int i11, long j12, long j13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lavaquestGameInfo.icon_pic;
        }
        if ((i12 & 2) != 0) {
            str2 = lavaquestGameInfo.name;
        }
        if ((i12 & 4) != 0) {
            str3 = lavaquestGameInfo.theme_pic;
        }
        if ((i12 & 8) != 0) {
            j11 = lavaquestGameInfo.end_time;
        }
        if ((i12 & 16) != 0) {
            i11 = lavaquestGameInfo.status;
        }
        if ((i12 & 32) != 0) {
            j12 = lavaquestGameInfo.cool_down_time;
        }
        if ((i12 & 64) != 0) {
            j13 = lavaquestGameInfo.game_session_id;
        }
        int i13 = i11;
        long j14 = j11;
        String str4 = str3;
        return lavaquestGameInfo.copy(str, str2, str4, j14, i13, j12, j13);
    }

    @k
    public final String component1() {
        return this.icon_pic;
    }

    @k
    public final String component2() {
        return this.name;
    }

    @k
    public final String component3() {
        return this.theme_pic;
    }

    public final long component4() {
        return this.end_time;
    }

    public final int component5() {
        return this.status;
    }

    public final long component6() {
        return this.cool_down_time;
    }

    public final long component7() {
        return this.game_session_id;
    }

    @k
    public final LavaquestGameInfo copy(@k String icon_pic, @k String name, @k String theme_pic, long j11, int i11, long j12, long j13) {
        g0.p(icon_pic, "icon_pic");
        g0.p(name, "name");
        g0.p(theme_pic, "theme_pic");
        return new LavaquestGameInfo(icon_pic, name, theme_pic, j11, i11, j12, j13);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LavaquestGameInfo)) {
            return false;
        }
        LavaquestGameInfo lavaquestGameInfo = (LavaquestGameInfo) obj;
        return g0.g(this.icon_pic, lavaquestGameInfo.icon_pic) && g0.g(this.name, lavaquestGameInfo.name) && g0.g(this.theme_pic, lavaquestGameInfo.theme_pic) && this.end_time == lavaquestGameInfo.end_time && this.status == lavaquestGameInfo.status && this.cool_down_time == lavaquestGameInfo.cool_down_time && this.game_session_id == lavaquestGameInfo.game_session_id;
    }

    public int hashCode() {
        return (((((((((((this.icon_pic.hashCode() * 31) + this.name.hashCode()) * 31) + this.theme_pic.hashCode()) * 31) + Long.hashCode(this.end_time)) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.cool_down_time)) * 31) + Long.hashCode(this.game_session_id);
    }

    @k
    public String toString() {
        return "LavaquestGameInfo(icon_pic=" + this.icon_pic + ", name=" + this.name + ", theme_pic=" + this.theme_pic + ", end_time=" + this.end_time + ", status=" + this.status + ", cool_down_time=" + this.cool_down_time + ", game_session_id=" + this.game_session_id + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        ADAPTER.write(protocol, this);
    }
}
