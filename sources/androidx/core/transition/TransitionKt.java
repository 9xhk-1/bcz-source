package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,76:1\n59#1,16:77\n59#1,16:93\n59#1,16:109\n59#1,16:125\n59#1,16:141\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n26#1:77,16\n33#1:93,16\n40#1:109,16\n47#1:125,16\n54#1:141,16\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionKt {
    @k
    public static final Transition.TransitionListener addListener(@k Transition transition, @k l<? super Transition, g2> lVar, @k l<? super Transition, g2> lVar2, @k l<? super Transition, g2> lVar3, @k l<? super Transition, g2> lVar4, @k l<? super Transition, g2> lVar5) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<Transition, g2>() { // from class: androidx.core.transition.TransitionKt$addListener$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Transition transition2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Transition transition2) {
                    invoke2(transition2);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 2) != 0) {
            lVar2 = new l<Transition, g2>() { // from class: androidx.core.transition.TransitionKt$addListener$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Transition transition2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Transition transition2) {
                    invoke2(transition2);
                    return g2.f100423a;
                }
            };
        }
        l lVar6 = lVar2;
        if ((i11 & 4) != 0) {
            lVar3 = new l<Transition, g2>() { // from class: androidx.core.transition.TransitionKt$addListener$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Transition transition2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Transition transition2) {
                    invoke2(transition2);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 8) != 0) {
            lVar4 = new l<Transition, g2>() { // from class: androidx.core.transition.TransitionKt$addListener$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Transition transition2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Transition transition2) {
                    invoke2(transition2);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 16) != 0) {
            lVar5 = new l<Transition, g2>() { // from class: androidx.core.transition.TransitionKt$addListener$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k Transition transition2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Transition transition2) {
                    invoke2(transition2);
                    return g2.f100423a;
                }
            };
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @k
    public static final Transition.TransitionListener doOnCancel(@k Transition transition, @k final l<? super Transition, g2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@k Transition transition2) {
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@k Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @k
    public static final Transition.TransitionListener doOnEnd(@k Transition transition, @k final l<? super Transition, g2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@k Transition transition2) {
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@k Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @k
    public static final Transition.TransitionListener doOnPause(@k Transition transition, @k final l<? super Transition, g2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@k Transition transition2) {
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@k Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @k
    public static final Transition.TransitionListener doOnResume(@k Transition transition, @k final l<? super Transition, g2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@k Transition transition2) {
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@k Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @k
    public static final Transition.TransitionListener doOnStart(@k Transition transition, @k final l<? super Transition, g2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@k Transition transition2) {
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@k Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@k Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
