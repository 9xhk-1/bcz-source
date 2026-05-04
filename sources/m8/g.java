package m8;

import com.baicizhan.biz.online.structs.BELogicException;
import com.baicizhan.biz.online.structs.BESystemException;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g extends com.microsoft.thrifty.service.b implements m8.f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f72636a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f72637b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, @m80.k String feedback, @m80.k xs.e<Integer> callback) {
            super("add_word_friend_feedback", (byte) 1, callback);
            g0.p(feedback, "feedback");
            g0.p(callback, "callback");
            this.f72636a = i11;
            this.f72637b = feedback;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(this.f72636a);
            protocol.N2();
            protocol.Q6("feedback", 2, (byte) 11);
            protocol.p1(this.f72637b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f72638a;

        /* JADX WARN: Multi-variable type inference failed */
        public a0(j00.c<? super Integer> cVar) {
            this.f72638a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f72638a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f72638a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final m8.d f72639a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k m8.d finish_plan_info, @m80.k xs.e<Integer> callback) {
            super("finish_plan_notify", (byte) 1, callback);
            g0.p(finish_plan_info, "finish_plan_info");
            g0.p(callback, "callback");
            this.f72639a = finish_plan_info;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("finish_plan_info", 1, (byte) 12);
            m8.d.f72615f.write(protocol, this.f72639a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b0 implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f72640a;

        /* JADX WARN: Multi-variable type inference failed */
        public b0(j00.c<? super Integer> cVar) {
            this.f72640a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f72640a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f72640a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends xs.d<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k xs.e<String> callback) {
            super("get_activity_url", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            String str = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    str = protocol.readString();
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (str != null) {
                return str;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends xs.d<List<? extends m8.a>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k xs.e<List<m8.a>> callback) {
            super("get_ads_list", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<m8.a> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(m8.a.f72571l.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends xs.d<List<? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f72641a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, @m80.k xs.e<List<Integer>> callback) {
            super("get_easy_words_list", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f72641a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Integer> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(Integer.valueOf(protocol.s8()));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f72641a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends xs.d<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k xs.e<Integer> callback) {
            super("get_latest_little_class_time", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m8.g$g, reason: collision with other inner class name */
    public static final class C0876g extends xs.d<List<? extends Integer>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0876g(@m80.k xs.e<List<Integer>> callback) {
            super("get_show_ads", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Integer> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(Integer.valueOf(protocol.s8()));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends xs.d<List<? extends m8.e>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f72642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i11, @m80.k xs.e<List<m8.e>> callback) {
            super("get_user_word_media_record", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f72642a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<m8.e> receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            ArrayList arrayList = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(m8.e.f72625g.read(protocol));
                    }
                    protocol.l8();
                    arrayList = arrayList2;
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f72642a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends xs.d<String> {

        /* renamed from: a, reason: collision with root package name */
        public final int f72643a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i11, @m80.k xs.e<String> callback) {
            super("get_word_friends_info", (byte) 1, callback);
            g0.p(callback, "callback");
            this.f72643a = i11;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            String str = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    str = protocol.readString();
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (str != null) {
                return str;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f72643a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends xs.d<m8.c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f72644a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k String qrcode, @m80.k xs.e<m8.c> callback) {
            super("qrcode_scan", (byte) 1, callback);
            g0.p(qrcode, "qrcode");
            g0.p(callback, "callback");
            this.f72644a = qrcode;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m8.c receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            m8.c cVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    cVar = m8.c.f72601h.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (cVar != null) {
                return cVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("qrcode", 1, (byte) 11);
            protocol.p1(this.f72644a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends xs.d<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@m80.k xs.e<Integer> callback) {
            super("redo_word_friend", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f72645a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f72646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i11, @m80.k List<Integer> done_topic_ids, @m80.k xs.e<Integer> callback) {
            super("save_word_friend_done_record", (byte) 1, callback);
            g0.p(done_topic_ids, "done_topic_ids");
            g0.p(callback, "callback");
            this.f72645a = i11;
            this.f72646b = done_topic_ids;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(this.f72645a);
            protocol.N2();
            protocol.Q6("done_topic_ids", 2, (byte) 15);
            protocol.y2((byte) 8, this.f72646b.size());
            Iterator<Integer> it = this.f72646b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<m8.e> f72647a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@m80.k List<m8.e> user_media_records, @m80.k xs.e<Integer> callback) {
            super("sync_user_word_media_record", (byte) 1, callback);
            g0.p(user_media_records, "user_media_records");
            g0.p(callback, "callback");
            this.f72647a = user_media_records;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("user_media_records", 1, (byte) 15);
            protocol.y2((byte) 12, this.f72647a.size());
            Iterator<m8.e> it = this.f72647a.iterator();
            while (it.hasNext()) {
                m8.e.f72625g.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<m8.b> f72648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@m80.k List<m8.b> operation_logs, @m80.k xs.e<Integer> callback) {
            super("user_operation_stat", (byte) 1, callback);
            g0.p(operation_logs, "operation_logs");
            g0.p(callback, "callback");
            this.f72648a = operation_logs;
        }

        @Override // xs.d
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@m80.k ws.i protocol, @m80.k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@m80.k ws.i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("operation_logs", 1, (byte) 15);
            protocol.y2((byte) 12, this.f72648a.size());
            Iterator<m8.b> it = this.f72648a.iterator();
            while (it.hasNext()) {
                m8.b.f72593e.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f72649a;

        /* JADX WARN: Multi-variable type inference failed */
        public o(j00.c<? super Integer> cVar) {
            this.f72649a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f72649a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f72649a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f72650a;

        /* JADX WARN: Multi-variable type inference failed */
        public p(j00.c<? super Integer> cVar) {
            this.f72650a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f72650a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f72650a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f72651a;

        /* JADX WARN: Multi-variable type inference failed */
        public q(j00.c<? super String> cVar) {
            this.f72651a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            g0.p(result, "result");
            j00.c<String> cVar = this.f72651a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<String> cVar = this.f72651a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r implements xs.e<List<? extends m8.a>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<m8.a>> f72652a;

        /* JADX WARN: Multi-variable type inference failed */
        public r(j00.c<? super List<m8.a>> cVar) {
            this.f72652a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<m8.a> result) {
            g0.p(result, "result");
            j00.c<List<m8.a>> cVar = this.f72652a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<List<m8.a>> cVar = this.f72652a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s implements xs.e<List<? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<Integer>> f72653a;

        /* JADX WARN: Multi-variable type inference failed */
        public s(j00.c<? super List<Integer>> cVar) {
            this.f72653a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<Integer> result) {
            g0.p(result, "result");
            j00.c<List<Integer>> cVar = this.f72653a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<List<Integer>> cVar = this.f72653a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f72654a;

        /* JADX WARN: Multi-variable type inference failed */
        public t(j00.c<? super Integer> cVar) {
            this.f72654a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f72654a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f72654a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u implements xs.e<List<? extends Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<Integer>> f72655a;

        /* JADX WARN: Multi-variable type inference failed */
        public u(j00.c<? super List<Integer>> cVar) {
            this.f72655a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<Integer> result) {
            g0.p(result, "result");
            j00.c<List<Integer>> cVar = this.f72655a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<List<Integer>> cVar = this.f72655a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v implements xs.e<List<? extends m8.e>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<List<m8.e>> f72656a;

        /* JADX WARN: Multi-variable type inference failed */
        public v(j00.c<? super List<m8.e>> cVar) {
            this.f72656a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k List<m8.e> result) {
            g0.p(result, "result");
            j00.c<List<m8.e>> cVar = this.f72656a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<List<m8.e>> cVar = this.f72656a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w implements xs.e<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<String> f72657a;

        /* JADX WARN: Multi-variable type inference failed */
        public w(j00.c<? super String> cVar) {
            this.f72657a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k String result) {
            g0.p(result, "result");
            j00.c<String> cVar = this.f72657a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<String> cVar = this.f72657a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x implements xs.e<m8.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<m8.c> f72658a;

        /* JADX WARN: Multi-variable type inference failed */
        public x(j00.c<? super m8.c> cVar) {
            this.f72658a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@m80.k m8.c result) {
            g0.p(result, "result");
            j00.c<m8.c> cVar = this.f72658a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<m8.c> cVar = this.f72658a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f72659a;

        /* JADX WARN: Multi-variable type inference failed */
        public y(j00.c<? super Integer> cVar) {
            this.f72659a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f72659a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f72659a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f72660a;

        /* JADX WARN: Multi-variable type inference failed */
        public z(j00.c<? super Integer> cVar) {
            this.f72660a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f72660a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@m80.k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f72660a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@m80.k ws.i protocol, @m80.k a.InterfaceC0480a listener) {
        super(protocol, listener);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
    }

    @Override // m8.f
    @m80.l
    public Object D0(@m80.k j00.c<? super List<Integer>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C0876g(new u(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object D4(@m80.k m8.d dVar, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b(dVar, new p(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object E5(@m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new k(new y(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object M2(int i11, @m80.k String str, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(i11, str, new o(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object c8(@m80.k List<m8.b> list, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new n(list, new b0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object e(@m80.k String str, @m80.k j00.c<? super m8.c> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new j(str, new x(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object f4(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new l(i11, list, new z(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object n8(@m80.k j00.c<? super List<m8.a>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d(new r(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object q(@m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new f(new t(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object r3(int i11, @m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new i(i11, new w(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object s4(@m80.k List<m8.e> list, @m80.k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new m(list, new a0(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object u7(@m80.k j00.c<? super String> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new c(new q(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object v2(int i11, @m80.k j00.c<? super List<Integer>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new e(i11, new s(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // m8.f
    @m80.l
    public Object v5(int i11, @m80.k j00.c<? super List<m8.e>> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new h(i11, new v(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }
}
