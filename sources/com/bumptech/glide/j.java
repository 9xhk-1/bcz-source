package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import cl.m;
import cl.p;
import cl.r;
import com.bumptech.glide.request.RequestCoordinator;
import fl.o;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j<TranscodeType> extends bl.a<j<TranscodeType>> implements Cloneable, h<j<TranscodeType>> {
    protected static final bl.g DOWNLOAD_ONLY_OPTIONS = new bl.g().diskCacheStrategy(kk.j.f66723c).priority(Priority.LOW).skipMemoryCache(true);
    private final Context context;

    @Nullable
    private j<TranscodeType> errorBuilder;
    private final c glide;
    private final e glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;

    @Nullable
    private Object model;

    @Nullable
    private List<bl.f<TranscodeType>> requestListeners;
    private final k requestManager;

    @Nullable
    private Float thumbSizeMultiplier;

    @Nullable
    private j<TranscodeType> thumbnailBuilder;
    private final Class<TranscodeType> transcodeClass;

    @NonNull
    private l<?, ? super TranscodeType> transitionOptions;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28706a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28707b;

        static {
            int[] iArr = new int[Priority.values().length];
            f28707b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28707b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28707b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28707b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f28706a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28706a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28706a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28706a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28706a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28706a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28706a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28706a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public j(@NonNull c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = cVar;
        this.requestManager = kVar;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = kVar.getDefaultTransitionOptions(cls);
        this.glideContext = cVar.k();
        n(kVar.getDefaultRequestListeners());
        apply((bl.a<?>) kVar.getDefaultRequestOptions());
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> addListener(@Nullable bl.f<TranscodeType> fVar) {
        if (isAutoCloneEnabled()) {
            return mo5628clone().addListener(fVar);
        }
        if (fVar != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(fVar);
        }
        return selfOrThrowIfLocked();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ bl.a apply(@NonNull bl.a aVar) {
        return apply((bl.a<?>) aVar);
    }

    @CheckResult
    @Deprecated
    public <Y extends p<File>> Y downloadOnly(@NonNull Y y11) {
        return (Y) getDownloadOnlyRequest().into((j<File>) y11);
    }

    @Override // bl.a
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (super.equals(jVar) && Objects.equals(this.transcodeClass, jVar.transcodeClass) && this.transitionOptions.equals(jVar.transitionOptions) && Objects.equals(this.model, jVar.model) && Objects.equals(this.requestListeners, jVar.requestListeners) && Objects.equals(this.thumbnailBuilder, jVar.thumbnailBuilder) && Objects.equals(this.errorBuilder, jVar.errorBuilder) && Objects.equals(this.thumbSizeMultiplier, jVar.thumbSizeMultiplier) && this.isDefaultTransitionOptionsSet == jVar.isDefaultTransitionOptionsSet && this.isModelSet == jVar.isModelSet) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public j<TranscodeType> error(@Nullable j<TranscodeType> jVar) {
        if (isAutoCloneEnabled()) {
            return mo5628clone().error((j) jVar);
        }
        this.errorBuilder = jVar;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public <Y extends p<TranscodeType>> Y experimentalIntoFront(@NonNull Y y11) {
        return (Y) into(y11, null, fl.f.c());
    }

    @NonNull
    public p<TranscodeType> experimentalPreloadFront(int i11, int i12) {
        return experimentalIntoFront((j<TranscodeType>) m.b(this.requestManager, i11, i12));
    }

    public final j<TranscodeType> g(j<TranscodeType> jVar) {
        return jVar.theme(this.context.getTheme()).signature(el.a.c(this.context));
    }

    @NonNull
    @CheckResult
    public j<File> getDownloadOnlyRequest() {
        return new j(File.class, this).apply((bl.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public Object getModel() {
        return this.model;
    }

    public k getRequestManager() {
        return this.requestManager;
    }

    public final bl.d h(p<TranscodeType> pVar, @Nullable bl.f<TranscodeType> fVar, bl.a<?> aVar, Executor executor) {
        return i(new Object(), pVar, fVar, null, this.transitionOptions, aVar.getPriority(), aVar.getOverrideWidth(), aVar.getOverrideHeight(), aVar, executor);
    }

    @Override // bl.a
    public int hashCode() {
        return o.t(this.isModelSet, o.t(this.isDefaultTransitionOptionsSet, o.r(this.thumbSizeMultiplier, o.r(this.errorBuilder, o.r(this.thumbnailBuilder, o.r(this.requestListeners, o.r(this.model, o.r(this.transitionOptions, o.r(this.transcodeClass, super.hashCode())))))))));
    }

    public final bl.d i(Object obj, p<TranscodeType> pVar, @Nullable bl.f<TranscodeType> fVar, @Nullable RequestCoordinator requestCoordinator, l<?, ? super TranscodeType> lVar, Priority priority, int i11, int i12, bl.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.a aVar2;
        RequestCoordinator requestCoordinator2;
        Object obj2;
        p<TranscodeType> pVar2;
        bl.f<TranscodeType> fVar2;
        l<?, ? super TranscodeType> lVar2;
        Priority priority2;
        int i13;
        int i14;
        bl.a<?> aVar3;
        Executor executor2;
        j<TranscodeType> jVar;
        if (this.errorBuilder != null) {
            aVar2 = new com.bumptech.glide.request.a(obj, requestCoordinator);
            requestCoordinator2 = aVar2;
            jVar = this;
            obj2 = obj;
            pVar2 = pVar;
            fVar2 = fVar;
            lVar2 = lVar;
            priority2 = priority;
            i13 = i11;
            i14 = i12;
            aVar3 = aVar;
            executor2 = executor;
        } else {
            aVar2 = null;
            requestCoordinator2 = requestCoordinator;
            obj2 = obj;
            pVar2 = pVar;
            fVar2 = fVar;
            lVar2 = lVar;
            priority2 = priority;
            i13 = i11;
            i14 = i12;
            aVar3 = aVar;
            executor2 = executor;
            jVar = this;
        }
        bl.d j11 = jVar.j(obj2, pVar2, fVar2, requestCoordinator2, lVar2, priority2, i13, i14, aVar3, executor2);
        if (aVar2 == null) {
            return j11;
        }
        int overrideWidth = this.errorBuilder.getOverrideWidth();
        int overrideHeight = this.errorBuilder.getOverrideHeight();
        if (o.x(i11, i12) && !this.errorBuilder.isValidOverride()) {
            overrideWidth = aVar.getOverrideWidth();
            overrideHeight = aVar.getOverrideHeight();
        }
        j<TranscodeType> jVar2 = this.errorBuilder;
        com.bumptech.glide.request.a aVar4 = aVar2;
        aVar4.n(j11, jVar2.i(obj, pVar, fVar, aVar4, jVar2.transitionOptions, jVar2.getPriority(), overrideWidth, overrideHeight, this.errorBuilder, executor));
        return aVar4;
    }

    @NonNull
    public <Y extends p<TranscodeType>> Y into(@NonNull Y y11) {
        return (Y) into(y11, null, fl.f.b());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bl.a] */
    public final bl.d j(Object obj, p<TranscodeType> pVar, bl.f<TranscodeType> fVar, @Nullable RequestCoordinator requestCoordinator, l<?, ? super TranscodeType> lVar, Priority priority, int i11, int i12, bl.a<?> aVar, Executor executor) {
        j<TranscodeType> jVar = this.thumbnailBuilder;
        if (jVar == null) {
            if (this.thumbSizeMultiplier == null) {
                return t(obj, pVar, fVar, aVar, requestCoordinator, lVar, priority, i11, i12, executor);
            }
            com.bumptech.glide.request.b bVar = new com.bumptech.glide.request.b(obj, requestCoordinator);
            bVar.m(t(obj, pVar, fVar, aVar, bVar, lVar, priority, i11, i12, executor), t(obj, pVar, fVar, aVar.mo5628clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), bVar, lVar, m(priority), i11, i12, executor));
            return bVar;
        }
        if (this.isThumbnailBuilt) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l<?, ? super TranscodeType> lVar2 = jVar.isDefaultTransitionOptionsSet ? lVar : jVar.transitionOptions;
        Priority priority2 = jVar.isPrioritySet() ? this.thumbnailBuilder.getPriority() : m(priority);
        int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
        int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
        if (o.x(i11, i12) && !this.thumbnailBuilder.isValidOverride()) {
            overrideWidth = aVar.getOverrideWidth();
            overrideHeight = aVar.getOverrideHeight();
        }
        com.bumptech.glide.request.b bVar2 = new com.bumptech.glide.request.b(obj, requestCoordinator);
        bl.d t11 = t(obj, pVar, fVar, aVar, bVar2, lVar, priority, i11, i12, executor);
        this.isThumbnailBuilt = true;
        j<TranscodeType> jVar2 = this.thumbnailBuilder;
        bl.d i13 = jVar2.i(obj, pVar, fVar, bVar2, lVar2, priority2, overrideWidth, overrideHeight, jVar2, executor);
        this.isThumbnailBuilt = false;
        bVar2.m(t11, i13);
        return bVar2;
    }

    public final j<TranscodeType> l() {
        return mo5628clone().error((j) null).thumbnail((j) null);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> listener(@Nullable bl.f<TranscodeType> fVar) {
        if (isAutoCloneEnabled()) {
            return mo5628clone().listener(fVar);
        }
        this.requestListeners = null;
        return addListener(fVar);
    }

    @NonNull
    public final Priority m(@NonNull Priority priority) {
        int i11 = a.f28707b[priority.ordinal()];
        if (i11 == 1) {
            return Priority.NORMAL;
        }
        if (i11 == 2) {
            return Priority.HIGH;
        }
        if (i11 == 3 || i11 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    @SuppressLint({"CheckResult"})
    public final void n(List<bl.f<Object>> list) {
        Iterator<bl.f<Object>> it = list.iterator();
        while (it.hasNext()) {
            addListener((bl.f) it.next());
        }
    }

    public final <Y extends p<TranscodeType>> Y o(@NonNull Y y11, @Nullable bl.f<TranscodeType> fVar, bl.a<?> aVar, Executor executor) {
        fl.m.e(y11);
        if (!this.isModelSet) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        bl.d h11 = h(y11, fVar, aVar, executor);
        bl.d f11 = y11.f();
        if (h11.g(f11) && !p(aVar, f11)) {
            if (!((bl.d) fl.m.e(f11)).isRunning()) {
                f11.c();
            }
            return y11;
        }
        this.requestManager.clear((p<?>) y11);
        y11.k(h11);
        this.requestManager.track(y11, h11);
        return y11;
    }

    public final boolean p(bl.a<?> aVar, bl.d dVar) {
        return !aVar.isMemoryCacheable() && dVar.isComplete();
    }

    @NonNull
    public p<TranscodeType> preload(int i11, int i12) {
        return into((j<TranscodeType>) m.b(this.requestManager, i11, i12));
    }

    @NonNull
    public final j<TranscodeType> q(@Nullable Object obj) {
        if (isAutoCloneEnabled()) {
            return mo5628clone().q(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return selfOrThrowIfLocked();
    }

    public final j<TranscodeType> s(@Nullable Uri uri, j<TranscodeType> jVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? jVar : g(jVar);
    }

    @NonNull
    public bl.c<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final bl.d t(Object obj, p<TranscodeType> pVar, bl.f<TranscodeType> fVar, bl.a<?> aVar, RequestCoordinator requestCoordinator, l<?, ? super TranscodeType> lVar, Priority priority, int i11, int i12, Executor executor) {
        Context context = this.context;
        e eVar = this.glideContext;
        return bl.i.x(context, eVar, obj, this.model, this.transcodeClass, aVar, i11, i12, priority, pVar, fVar, this.requestListeners, requestCoordinator, eVar.f(), lVar.c(), executor);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> thumbnail(@Nullable j<TranscodeType> jVar) {
        if (isAutoCloneEnabled()) {
            return mo5628clone().thumbnail(jVar);
        }
        this.thumbnailBuilder = jVar;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> transition(@NonNull l<?, ? super TranscodeType> lVar) {
        if (isAutoCloneEnabled()) {
            return mo5628clone().transition(lVar);
        }
        this.transitionOptions = (l) fl.m.e(lVar);
        this.isDefaultTransitionOptionsSet = false;
        return selfOrThrowIfLocked();
    }

    @Override // bl.a
    @NonNull
    @CheckResult
    public j<TranscodeType> apply(@NonNull bl.a<?> aVar) {
        fl.m.e(aVar);
        return (j) super.apply(aVar);
    }

    @CheckResult
    @Deprecated
    public bl.c<File> downloadOnly(int i11, int i12) {
        return getDownloadOnlyRequest().submit(i11, i12);
    }

    @NonNull
    public r<ImageView, TranscodeType> experimentalIntoFront(@NonNull ImageView imageView) {
        j<TranscodeType> jVar;
        o.b();
        fl.m.e(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f28706a[imageView.getScaleType().ordinal()]) {
                case 1:
                    jVar = mo5628clone().optionalCenterCrop();
                    break;
                case 2:
                    jVar = mo5628clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    jVar = mo5628clone().optionalFitCenter();
                    break;
                case 6:
                    jVar = mo5628clone().optionalCenterInside();
                    break;
            }
            return (r) o(this.glideContext.a(imageView, this.transcodeClass), null, jVar, fl.f.c());
        }
        jVar = this;
        return (r) o(this.glideContext.a(imageView, this.transcodeClass), null, jVar, fl.f.c());
    }

    @NonNull
    public <Y extends p<TranscodeType>> Y into(@NonNull Y y11, @Nullable bl.f<TranscodeType> fVar, Executor executor) {
        return (Y) o(y11, fVar, this, executor);
    }

    @NonNull
    public bl.c<TranscodeType> submit(int i11, int i12) {
        bl.e eVar = new bl.e(i11, i12);
        return (bl.c) into(eVar, eVar, fl.f.a());
    }

    @Override // bl.a
    @CheckResult
    /* renamed from: clone */
    public j<TranscodeType> mo5628clone() {
        j<TranscodeType> jVar = (j) super.mo5628clone();
        jVar.transitionOptions = (l<?, ? super TranscodeType>) jVar.transitionOptions.clone();
        if (jVar.requestListeners != null) {
            jVar.requestListeners = new ArrayList(jVar.requestListeners);
        }
        j<TranscodeType> jVar2 = jVar.thumbnailBuilder;
        if (jVar2 != null) {
            jVar.thumbnailBuilder = jVar2.mo5628clone();
        }
        j<TranscodeType> jVar3 = jVar.errorBuilder;
        if (jVar3 != null) {
            jVar.errorBuilder = jVar3.mo5628clone();
        }
        return jVar;
    }

    @NonNull
    public r<ImageView, TranscodeType> into(@NonNull ImageView imageView) {
        j<TranscodeType> jVar;
        o.b();
        fl.m.e(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f28706a[imageView.getScaleType().ordinal()]) {
                case 1:
                    jVar = mo5628clone().optionalCenterCrop();
                    break;
                case 2:
                    jVar = mo5628clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    jVar = mo5628clone().optionalFitCenter();
                    break;
                case 6:
                    jVar = mo5628clone().optionalCenterInside();
                    break;
            }
            return (r) o(this.glideContext.a(imageView, this.transcodeClass), null, jVar, fl.f.b());
        }
        jVar = this;
        return (r) o(this.glideContext.a(imageView, this.transcodeClass), null, jVar, fl.f.b());
    }

    @NonNull
    public p<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> error(Object obj) {
        if (obj == null) {
            return error((j) null);
        }
        return error((j) l().load(obj));
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> thumbnail(@Nullable j<TranscodeType>... jVarArr) {
        if (jVarArr != null && jVarArr.length != 0) {
            return thumbnail(Arrays.asList(jVarArr));
        }
        return thumbnail((j) null);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> thumbnail(@Nullable List<j<TranscodeType>> list) {
        j<TranscodeType> jVar = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                j<TranscodeType> jVar2 = list.get(size);
                if (jVar2 != null) {
                    jVar = jVar == null ? jVar2 : jVar2.thumbnail(jVar);
                }
            }
            return thumbnail(jVar);
        }
        return thumbnail((j) null);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable Object obj) {
        return q(obj);
    }

    @SuppressLint({"CheckResult"})
    public j(Class<TranscodeType> cls, j<?> jVar) {
        this(jVar.glide, jVar.requestManager, cls, jVar.context);
        this.model = jVar.model;
        this.isModelSet = jVar.isModelSet;
        apply((bl.a<?>) jVar);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable Bitmap bitmap) {
        return q(bitmap).apply((bl.a<?>) bl.g.diskCacheStrategyOf(kk.j.f66722b));
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable Drawable drawable) {
        return q(drawable).apply((bl.a<?>) bl.g.diskCacheStrategyOf(kk.j.f66722b));
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable String str) {
        return q(str);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable Uri uri) {
        return s(uri, q(uri));
    }

    @NonNull
    @CheckResult
    @Deprecated
    public j<TranscodeType> thumbnail(float f11) {
        if (isAutoCloneEnabled()) {
            return mo5628clone().thumbnail(f11);
        }
        if (f11 >= 0.0f && f11 <= 1.0f) {
            this.thumbSizeMultiplier = Float.valueOf(f11);
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable File file) {
        return q(file);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable @DrawableRes @RawRes Integer num) {
        return g(q(num));
    }

    @Deprecated
    public bl.c<TranscodeType> into(int i11, int i12) {
        return submit(i11, i12);
    }

    @CheckResult
    @Deprecated
    public j<TranscodeType> load(@Nullable URL url) {
        return q(url);
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> load(@Nullable byte[] bArr) {
        j<TranscodeType> q11 = q(bArr);
        if (!q11.isDiskCacheStrategySet()) {
            q11 = q11.apply((bl.a<?>) bl.g.diskCacheStrategyOf(kk.j.f66722b));
        }
        return !q11.isSkipMemoryCacheSet() ? q11.apply((bl.a<?>) bl.g.skipMemoryCacheOf(true)) : q11;
    }
}
