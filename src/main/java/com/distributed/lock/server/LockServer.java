package com.distributed.lock.server;

/**
 * 
 * @author allen
 *
 */
public interface LockServer {
    
    /**
     * lock resource use id 
     * @param resourceId
     */
    void lock(String resourceId);
    
    /**
     * try lock
     * @param resourceId
     * @return
     */
    boolean tryLock(String resourceId);
    
    /**
     * release lock
     * @param resourceId
     */
    void release(String resourceId);
}
