package com.distrbutor.lock.server;

import java.util.concurrent.TimeUnit;

/**
 * 
* lock server.
*		
* @author: alei
* @version: 1.0, 12 May 2015
 */
public interface LockServer {

    void lock(String resourceId);
    
    void lock(String resourceId,TimeUnit timeUnit);
    
    boolean tryLock(String resourceId);
    
    boolean tryLock(String resourceId,TimeUnit timeUnit);
    
    void release(String resourceId);
    
}
