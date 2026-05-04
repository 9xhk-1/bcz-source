package com.baicizhan.client.business.webview;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.sign.SignManager;
import com.baicizhan.client.business.webview.ui.BczWebActivity;
import com.baicizhan.client.business.webview.ui.WebWorker;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBczWebDirector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczWebDirector.kt\ncom/baicizhan/client/business/webview/BczWebDirector\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,121:1\n35#2:122\n*S KotlinDebug\n*F\n+ 1 BczWebDirector.kt\ncom/baicizhan/client/business/webview/BczWebDirector\n*L\n45#1:122\n*E\n"})
/* loaded from: classes4.dex */
public final class BczWebDirector {
    public static final int $stable = 8;

    @k
    private final Arguments args;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Builder {
        public static final int $stable = 8;

        @k
        private final Arguments args = new Arguments();

        @k
        public final BczWebDirector build() {
            return new BczWebDirector(this.args, null);
        }

        @k
        public final Builder setAnonymous(boolean z11) {
            this.args.getArguments().putBoolean(Arguments.ARG_ANONYMOUS, z11);
            return this;
        }

        @k
        public final Builder setDefaultUrl(@l String str) {
            this.args.getArguments().putString(Arguments.ARG_DEFAULT_URL, str);
            return this;
        }

        @k
        public final Builder setFixedClosed(boolean z11) {
            this.args.getArguments().putBoolean(Arguments.ARG_FIXED_CLOSE, z11);
            return this;
        }

        @k
        public final Builder setLeftIn(boolean z11) {
            this.args.getArguments().putBoolean(Arguments.ARG_LEFT_IN, z11);
            return this;
        }

        @k
        public final Builder setNeedCache(boolean z11) {
            this.args.getArguments().putBoolean(Arguments.ARG_NEED_CACHE, z11);
            return this;
        }

        @k
        public final Builder setShowShare(boolean z11) {
            this.args.getArguments().putBoolean(Arguments.ARG_DISPLAY_SHARE, z11);
            return this;
        }

        @k
        public final Builder setTitle(@l String str) {
            this.args.getArguments().putString("title", str);
            return this;
        }

        @k
        public final Builder setUrlStrategy(int i11) {
            this.args.getArguments().putInt(Arguments.ARG_URL_STRATEGY, i11);
            return this;
        }

        @k
        public final Builder setWebOption(@k OpenWebViewOption option) {
            g0.p(option, "option");
            this.args.getArguments().putParcelable(Arguments.ARG_NEW_WEB_OPTION, option);
            return this;
        }

        @k
        public final Builder setWebWorker(@l WebWorker webWorker) {
            if (webWorker != null) {
                this.args.getArguments().putSerializable(Arguments.ARG_WEB_WORKER, webWorker);
            }
            return this;
        }
    }

    public /* synthetic */ BczWebDirector(Arguments arguments, v vVar) {
        this(arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 goToWeb$lambda$0(Context context, BczWebDirector bczWebDirector) {
        BczWebActivity.start(context, bczWebDirector.args);
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 goToWebForResult$lambda$0(Activity activity, BczWebDirector bczWebDirector, int i11) {
        BczWebActivity.startForResult(activity, bczWebDirector.args, i11);
        return g2.f100423a;
    }

    private final void loadUrlAndGo(final x00.a<g2> aVar) {
        final String string = this.args.getArguments().getString(Arguments.ARG_DEFAULT_URL);
        rx.c<Boolean> I3 = SignManager.getInstance().rxInit(KotlinExtKt.getGlobalApplicationContext()).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.client.business.webview.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 loadUrlAndGo$lambda$0;
                loadUrlAndGo$lambda$0 = BczWebDirector.loadUrlAndGo$lambda$0(string, this, aVar, (Boolean) obj);
                return loadUrlAndGo$lambda$0;
            }
        };
        I3.u5(new wb0.b() { // from class: com.baicizhan.client.business.webview.b
            @Override // wb0.b
            public final void call(Object obj) {
                x00.l.this.invoke(obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.client.business.webview.c
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(BczWebHelperKt.TAG, "loadUrlAndGo", (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 loadUrlAndGo$lambda$0(String str, BczWebDirector bczWebDirector, x00.a aVar, Boolean bool) {
        if (str == null) {
            str = "";
        }
        Pair<String, OpenWebViewOption> parseUrlToWeb = BczWebHelperKt.parseUrlToWeb(str);
        bczWebDirector.args.getArguments().putString(Arguments.ARG_DEFAULT_URL, parseUrlToWeb.getFirst());
        OpenWebViewOption second = parseUrlToWeb.getSecond();
        if (second != null) {
            bczWebDirector.args.getArguments().putParcelable(Arguments.ARG_NEW_WEB_OPTION, second);
        }
        aVar.invoke();
        return g2.f100423a;
    }

    @k
    public final Arguments getArgs() {
        return this.args;
    }

    public final void goToWeb(@l final Context context) {
        loadUrlAndGo(new x00.a() { // from class: com.baicizhan.client.business.webview.d
            @Override // x00.a
            public final Object invoke() {
                g2 goToWeb$lambda$0;
                goToWeb$lambda$0 = BczWebDirector.goToWeb$lambda$0(context, this);
                return goToWeb$lambda$0;
            }
        });
    }

    public final void goToWebForResult(@k final Activity activity, final int i11) {
        g0.p(activity, "activity");
        loadUrlAndGo(new x00.a() { // from class: com.baicizhan.client.business.webview.e
            @Override // x00.a
            public final Object invoke() {
                g2 goToWebForResult$lambda$0;
                goToWebForResult$lambda$0 = BczWebDirector.goToWebForResult$lambda$0(activity, this, i11);
                return goToWebForResult$lambda$0;
            }
        });
    }

    private BczWebDirector(Arguments arguments) {
        this.args = arguments;
    }
}
