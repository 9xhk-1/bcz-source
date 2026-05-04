package com.baicizhan.client.business.util.navigate;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.webview.JsonParams;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class NavigationIntent<T> {
    public static final int $stable = 0;
    private final T intent;

    @l
    private final String url;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Native extends NavigationIntent<Uri> {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Native(@k Uri uri) {
            super(uri, uri.toString(), null);
            g0.p(uri, "uri");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Unknown extends NavigationIntent<Object> {

        @k
        public static final Unknown INSTANCE = new Unknown();
        public static final int $stable = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private Unknown() {
            super(new Object(), null, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Web extends NavigationIntent<String> {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Web(@k String url) {
            super(url, url, null);
            g0.p(url, "url");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class WebIntent extends NavigationIntent<JsonParams.WebActivityIntentI> {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebIntent(@k JsonParams.WebActivityIntentI intent) {
            super(intent, intent.url, null);
            g0.p(intent, "intent");
        }
    }

    public /* synthetic */ NavigationIntent(Object obj, String str, v vVar) {
        this(obj, str);
    }

    public final T getIntent() {
        return this.intent;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    private NavigationIntent(T t11, String str) {
        this.intent = t11;
        this.url = str;
    }
}
