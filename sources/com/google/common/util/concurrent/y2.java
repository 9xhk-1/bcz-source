package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class y2 {
    @go.d
    @go.c
    public static void a(ExecutorService executor) {
        ho.w0.a(b(executor, Long.MAX_VALUE, TimeUnit.NANOSECONDS));
    }

    @go.d
    @go.c
    public static boolean b(ExecutorService executor, long timeout, TimeUnit unit) {
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(timeout);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return executor.awaitTermination(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @go.d
    @go.c
    public static void c(CountDownLatch latch) {
        boolean z11 = false;
        while (true) {
            try {
                latch.await();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    @go.d
    @go.c
    public static boolean d(CountDownLatch latch, long timeout, TimeUnit unit) {
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(timeout);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return latch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @go.d
    @go.c
    public static boolean e(Condition condition, long timeout, TimeUnit unit) {
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(timeout);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return condition.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @z1
    @uo.a
    public static <V> V f(Future<V> future) throws ExecutionException {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    @z1
    @go.d
    @go.c
    @uo.a
    public static <V> V g(Future<V> future, long timeout, TimeUnit unit) throws ExecutionException, TimeoutException {
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(timeout);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return future.get(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @go.d
    @go.c
    public static void h(Thread toJoin) {
        boolean z11 = false;
        while (true) {
            try {
                toJoin.join();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    @go.d
    @go.c
    public static void i(Thread toJoin, long timeout, TimeUnit unit) {
        Preconditions.checkNotNull(toJoin);
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(timeout);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(toJoin, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = nanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @go.d
    @go.c
    public static <E> void j(BlockingQueue<E> queue, E element) {
        boolean z11 = false;
        while (true) {
            try {
                queue.put(element);
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    @go.d
    @go.c
    public static void k(long sleepFor, TimeUnit unit) {
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(sleepFor);
            long nanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = nanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @go.d
    @go.c
    public static <E> E l(BlockingQueue<E> queue) {
        E take;
        boolean z11 = false;
        while (true) {
            try {
                take = queue.take();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @go.d
    @go.c
    public static boolean m(Semaphore semaphore, int permits, long timeout, TimeUnit unit) {
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(timeout);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return semaphore.tryAcquire(permits, nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @go.d
    @go.c
    public static boolean n(Semaphore semaphore, long timeout, TimeUnit unit) {
        return m(semaphore, 1, timeout, unit);
    }

    @go.d
    @go.c
    public static boolean o(Lock lock, long timeout, TimeUnit unit) {
        boolean z11 = false;
        try {
            long nanos = unit.toNanos(timeout);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return lock.tryLock(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
