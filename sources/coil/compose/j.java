package coil.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f9683a = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it's not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it's recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ProvidableCompositionLocal<b0.f> f9684b = h.c(null, 1, null);

    @m80.k
    public static final ProvidableCompositionLocal<b0.f> a() {
        return f9684b;
    }

    @yz.n(message = f9683a)
    public static /* synthetic */ void b() {
    }
}
