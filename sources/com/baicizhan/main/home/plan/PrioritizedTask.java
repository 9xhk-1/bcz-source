package com.baicizhan.main.home.plan;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.online.notify.NotifyResult;
import com.baicizhan.online.user_assistant_api.ClipboardResp;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class PrioritizedTask {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f21788b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f21789c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f21790d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f21791e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f21792f = 100;

    /* renamed from: g, reason: collision with root package name */
    public static final int f21793g = 11;

    /* renamed from: h, reason: collision with root package name */
    public static final int f21794h = 11;

    /* renamed from: i, reason: collision with root package name */
    public static final int f21795i = 12;

    /* renamed from: a, reason: collision with root package name */
    public final int f21796a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Ad extends PrioritizedTask {

        /* renamed from: k, reason: collision with root package name */
        public static final int f21797k = 8;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final com.baicizhan.main.home.plan.a f21798j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ad(@m80.k com.baicizhan.main.home.plan.a ad2) {
            super(11, null);
            kotlin.jvm.internal.g0.p(ad2, "ad");
            this.f21798j = ad2;
        }

        @m80.k
        public final com.baicizhan.main.home.plan.a b() {
            return this.f21798j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class CodeShare extends PrioritizedTask {

        /* renamed from: l, reason: collision with root package name */
        public static final int f21799l = 8;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final ClipboardResp f21800j;

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public final String f21801k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CodeShare(@m80.k ClipboardResp code, @m80.k String source) {
            super(11, null);
            kotlin.jvm.internal.g0.p(code, "code");
            kotlin.jvm.internal.g0.p(source, "source");
            this.f21800j = code;
            this.f21801k = source;
        }

        @m80.k
        public final ClipboardResp b() {
            return this.f21800j;
        }

        @m80.k
        public final String c() {
            return this.f21801k;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Done extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final Done f21802j = new Done();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21803k = 0;

        private Done() {
            super(0, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class MainGuider extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final MainGuider f21804j = new MainGuider();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21805k = 0;

        private MainGuider() {
            super(0, 1, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class NewUser extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final NewUser f21806j = new NewUser();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21807k = 0;

        private NewUser() {
            super(12, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class None extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final None f21808j = new None();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21809k = 0;

        private None() {
            super(0, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Notify extends PrioritizedTask {

        /* renamed from: k, reason: collision with root package name */
        public static final int f21810k = 8;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final NotifyResult f21811j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Notify(@m80.k NotifyResult notify) {
            super(0, 1, null);
            kotlin.jvm.internal.g0.p(notify, "notify");
            this.f21811j = notify;
        }

        @m80.k
        public final NotifyResult b() {
            return this.f21811j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Pending extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final Pending f21812j = new Pending();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21813k = 0;

        private Pending() {
            super(0, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class PromptEmergency extends PrioritizedTask {

        /* renamed from: k, reason: collision with root package name */
        public static final int f21814k = 0;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final Pair<String, String> f21815j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromptEmergency(@m80.k Pair<String, String> content) {
            super(100, null);
            kotlin.jvm.internal.g0.p(content, "content");
            this.f21815j = content;
        }

        @m80.k
        public final Pair<String, String> b() {
            return this.f21815j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class PromptPraise extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final PromptPraise f21816j = new PromptPraise();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21817k = 0;

        private PromptPraise() {
            super(0, 1, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class PromptReminder extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final PromptReminder f21818j = new PromptReminder();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21819k = 0;

        private PromptReminder() {
            super(0, 1, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class RoleFillIn extends PrioritizedTask {

        /* renamed from: k, reason: collision with root package name */
        public static final int f21820k = 0;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final Pair<Integer, Integer> f21821j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoleFillIn(@m80.k Pair<Integer, Integer> role) {
            super(0, 1, null);
            kotlin.jvm.internal.g0.p(role, "role");
            this.f21821j = role;
        }

        @m80.k
        public final Pair<Integer, Integer> b() {
            return this.f21821j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class ShowOff extends PrioritizedTask {

        /* renamed from: k, reason: collision with root package name */
        public static final int f21822k = 8;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final Pair<BookRecord, Integer> f21823j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowOff(@m80.k Pair<? extends BookRecord, Integer> info) {
            super(0, 1, null);
            kotlin.jvm.internal.g0.p(info, "info");
            this.f21823j = info;
        }

        @m80.k
        public final Pair<BookRecord, Integer> b() {
            return this.f21823j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class VocabularyTest extends PrioritizedTask {

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public static final VocabularyTest f21824j = new VocabularyTest();

        /* renamed from: k, reason: collision with root package name */
        public static final int f21825k = 0;

        private VocabularyTest() {
            super(0, 1, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ PrioritizedTask(int i11, kotlin.jvm.internal.v vVar) {
        this(i11);
    }

    public final int a() {
        return this.f21796a;
    }

    @m80.k
    public String toString() {
        return "Task[" + getClass().getSimpleName() + "]";
    }

    public PrioritizedTask(int i11) {
        this.f21796a = i11;
    }

    public /* synthetic */ PrioritizedTask(int i11, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? 1 : i11, null);
    }
}
