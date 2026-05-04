package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n91#1,14:124\n91#1,14:138\n91#1,14:152\n91#1,14:166\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n30#1:124,14\n41#1:138,14\n52#1:152,14\n62#1:166,14\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimatorKt {
    @k
    public static final Animator.AnimatorListener addListener(@k Animator animator, @k l<? super Animator, g2> lVar, @k l<? super Animator, g2> lVar2, @k l<? super Animator, g2> lVar3, @k l<? super Animator, g2> lVar4) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, l lVar, l lVar2, l lVar3, l lVar4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<Animator, g2>() { // from class: androidx.core.animation.AnimatorKt$addListener$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Animator animator2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Animator animator2) {
                    invoke2(animator2);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 2) != 0) {
            lVar2 = new l<Animator, g2>() { // from class: androidx.core.animation.AnimatorKt$addListener$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Animator animator2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Animator animator2) {
                    invoke2(animator2);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            lVar3 = new l<Animator, g2>() { // from class: androidx.core.animation.AnimatorKt$addListener$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Animator animator2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Animator animator2) {
                    invoke2(animator2);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 8) != 0) {
            lVar4 = new l<Animator, g2>() { // from class: androidx.core.animation.AnimatorKt$addListener$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Animator animator2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Animator animator2) {
                    invoke2(animator2);
                    return g2.f100423a;
                }
            };
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    @k
    public static final Animator.AnimatorPauseListener addPauseListener(@k Animator animator, @k final l<? super Animator, g2> lVar, @k final l<? super Animator, g2> lVar2) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(@k Animator animator2) {
                lVar2.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(@k Animator animator2) {
                lVar.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, l lVar, l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<Animator, g2>() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Animator animator2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Animator animator2) {
                    invoke2(animator2);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 2) != 0) {
            lVar2 = new l<Animator, g2>() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Animator animator2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Animator animator2) {
                    invoke2(animator2);
                    return g2.f100423a;
                }
            };
        }
        return addPauseListener(animator, lVar, lVar2);
    }

    @k
    public static final Animator.AnimatorListener doOnCancel(@k Animator animator, @k final l<? super Animator, g2> lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@k Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@k Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    @k
    public static final Animator.AnimatorListener doOnEnd(@k Animator animator, @k final l<? super Animator, g2> lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@k Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@k Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    @k
    public static final Animator.AnimatorPauseListener doOnPause(@k Animator animator, @k l<? super Animator, g2> lVar) {
        return addPauseListener$default(animator, null, lVar, 1, null);
    }

    @k
    public static final Animator.AnimatorListener doOnRepeat(@k Animator animator, @k final l<? super Animator, g2> lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@k Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@k Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    @k
    public static final Animator.AnimatorPauseListener doOnResume(@k Animator animator, @k l<? super Animator, g2> lVar) {
        return addPauseListener$default(animator, lVar, null, 2, null);
    }

    @k
    public static final Animator.AnimatorListener doOnStart(@k Animator animator, @k final l<? super Animator, g2> lVar) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@k Animator animator2) {
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@k Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@k Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
