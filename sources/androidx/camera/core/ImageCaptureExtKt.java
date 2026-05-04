package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import c40.x1;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nImageCaptureExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,203:1\n329#2:204\n329#2:216\n314#3,11:205\n314#3,11:217\n*S KotlinDebug\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n*L\n50#1:204\n102#1:216\n52#1:205,11\n104#1:217,11\n*E\n"})
/* loaded from: classes.dex */
public final class ImageCaptureExtKt {
    @m80.l
    @VisibleForTesting
    public static final TakePictureRequest getTakePictureRequest(@m80.k ImageCapture imageCapture) {
        kotlin.jvm.internal.g0.p(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.camera.core.DelegatingImageCapturedCallback] */
    @m80.l
    public static final Object takePicture(@m80.k ImageCapture imageCapture, @m80.l final x00.a<g2> aVar, @m80.l final x00.l<? super Integer, g2> lVar, @m80.l final x00.l<? super Bitmap, g2> lVar2, @m80.k j00.c<? super ImageProxy> cVar) {
        Executor directExecutor;
        d.b bVar = cVar.getContext().get(kotlin.coroutines.c.f66933w0);
        DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        c40.m0 m0Var = bVar instanceof c40.m0 ? (c40.m0) bVar : null;
        if (m0Var == null || (directExecutor = x1.b(m0Var)) == null) {
            directExecutor = CameraXExecutors.directExecutor();
            kotlin.jvm.internal.g0.o(directExecutor, "directExecutor()");
        }
        final c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i11) {
                x00.l<Integer, g2> lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.invoke(Integer.valueOf(i11));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                x00.a<g2> aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(@m80.k ImageProxy imageProxy) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                kotlin.jvm.internal.g0.p(imageProxy, "imageProxy");
                DelegatingImageCapturedCallback delegatingImageCapturedCallback3 = objectRef.element;
                if (delegatingImageCapturedCallback3 == null) {
                    kotlin.jvm.internal.g0.S("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = delegatingImageCapturedCallback3;
                }
                delegatingImageCapturedCallback2.dispose();
                c40.n<ImageProxy> nVar = pVar;
                Result.a aVar2 = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(@m80.k ImageCaptureException exception) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                kotlin.jvm.internal.g0.p(exception, "exception");
                DelegatingImageCapturedCallback delegatingImageCapturedCallback3 = objectRef.element;
                if (delegatingImageCapturedCallback3 == null) {
                    kotlin.jvm.internal.g0.S("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = delegatingImageCapturedCallback3;
                }
                delegatingImageCapturedCallback2.dispose();
                c40.n<ImageProxy> nVar = pVar;
                Result.a aVar2 = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(@m80.k Bitmap bitmap) {
                kotlin.jvm.internal.g0.p(bitmap, "bitmap");
                x00.l<Bitmap, g2> lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(bitmap);
                }
            }
        });
        pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.l Throwable th2) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                DelegatingImageCapturedCallback delegatingImageCapturedCallback3 = objectRef.element;
                if (delegatingImageCapturedCallback3 == null) {
                    kotlin.jvm.internal.g0.S("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = delegatingImageCapturedCallback3;
                }
                delegatingImageCapturedCallback2.dispose();
            }
        });
        T t11 = objectRef.element;
        if (t11 == 0) {
            kotlin.jvm.internal.g0.S("delegatingCallback");
        } else {
            delegatingImageCapturedCallback = (DelegatingImageCapturedCallback) t11;
        }
        imageCapture.takePicture(directExecutor, delegatingImageCapturedCallback);
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, x00.a aVar, x00.l lVar, x00.l lVar2, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = null;
        }
        return takePicture(imageCapture, aVar, lVar, lVar2, cVar);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, x00.a aVar, x00.l lVar, x00.l lVar2, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        if ((i11 & 8) != 0) {
            lVar2 = null;
        }
        return takePicture(imageCapture, outputFileOptions, aVar, lVar, lVar2, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.camera.core.DelegatingImageSavedCallback] */
    @m80.l
    public static final Object takePicture(@m80.k ImageCapture imageCapture, @m80.k ImageCapture.OutputFileOptions outputFileOptions, @m80.l final x00.a<g2> aVar, @m80.l final x00.l<? super Integer, g2> lVar, @m80.l final x00.l<? super Bitmap, g2> lVar2, @m80.k j00.c<? super ImageCapture.OutputFileResults> cVar) {
        Executor directExecutor;
        d.b bVar = cVar.getContext().get(kotlin.coroutines.c.f66933w0);
        DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        c40.m0 m0Var = bVar instanceof c40.m0 ? (c40.m0) bVar : null;
        if (m0Var == null || (directExecutor = x1.b(m0Var)) == null) {
            directExecutor = CameraXExecutors.directExecutor();
            kotlin.jvm.internal.g0.o(directExecutor, "directExecutor()");
        }
        final c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i11) {
                x00.l<Integer, g2> lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.invoke(Integer.valueOf(i11));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                x00.a<g2> aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(@m80.k ImageCaptureException exception) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                kotlin.jvm.internal.g0.p(exception, "exception");
                DelegatingImageSavedCallback delegatingImageSavedCallback3 = objectRef.element;
                if (delegatingImageSavedCallback3 == null) {
                    kotlin.jvm.internal.g0.S("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = delegatingImageSavedCallback3;
                }
                delegatingImageSavedCallback2.dispose();
                c40.n<ImageCapture.OutputFileResults> nVar = pVar;
                Result.a aVar2 = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(exception)));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(@m80.k ImageCapture.OutputFileResults outputFileResults) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                kotlin.jvm.internal.g0.p(outputFileResults, "outputFileResults");
                DelegatingImageSavedCallback delegatingImageSavedCallback3 = objectRef.element;
                if (delegatingImageSavedCallback3 == null) {
                    kotlin.jvm.internal.g0.S("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = delegatingImageSavedCallback3;
                }
                delegatingImageSavedCallback2.dispose();
                c40.n<ImageCapture.OutputFileResults> nVar = pVar;
                Result.a aVar2 = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(outputFileResults));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(@m80.k Bitmap bitmap) {
                kotlin.jvm.internal.g0.p(bitmap, "bitmap");
                x00.l<Bitmap, g2> lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(bitmap);
                }
            }
        });
        pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.l Throwable th2) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                DelegatingImageSavedCallback delegatingImageSavedCallback3 = objectRef.element;
                if (delegatingImageSavedCallback3 == null) {
                    kotlin.jvm.internal.g0.S("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = delegatingImageSavedCallback3;
                }
                delegatingImageSavedCallback2.dispose();
            }
        });
        T t11 = objectRef.element;
        if (t11 == 0) {
            kotlin.jvm.internal.g0.S("delegatingCallback");
        } else {
            delegatingImageSavedCallback = (DelegatingImageSavedCallback) t11;
        }
        imageCapture.takePicture(outputFileOptions, directExecutor, delegatingImageSavedCallback);
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }
}
