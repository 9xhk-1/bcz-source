package androidx.compose.foundation.gestures;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import yz.n;
import yz.w0;
import zz.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c(AnnotationRetention.BINARY)
@RequiresOptIn(message = "This API feature-flags new behavior and will be removed in the future.")
@Retention(RetentionPolicy.CLASS)
@n(message = "The flag for this opt-in marker has been moved to ComposeFoundationFlags and renamed to isDetectTapGesturesImmediateCoroutineDispatchEnabled. For compatibility,  DetectTapGesturesEnableNewDispatchingBehavior controls the new flag (isDetectTapGesturesImmediateCoroutineDispatchEnabled). Please use  isDetectTapGesturesImmediateCoroutineDispatchEnabled instead.", replaceWith = @w0(expression = "ExperimentalFoundationApi", imports = {"androidx.compose.foundation"}))
/* loaded from: classes.dex */
public @interface ExperimentalTapGestureDetectorBehaviorApi {
}
