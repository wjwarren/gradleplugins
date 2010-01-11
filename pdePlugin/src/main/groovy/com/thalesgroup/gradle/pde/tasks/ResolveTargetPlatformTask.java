package com.thalesgroup.gradle.pde.tasks;

import com.thalesgroup.gradle.pde.ProductPdeConvention;
import org.gradle.api.tasks.TaskAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Rene Groeschke
 * Date: 11.01.2010
 * Time: 21:28:29
 * To change this template use File | Settings | File Templates.
 */
public class ResolveTargetPlatformTask extends CommonTask {

  private static Logger logger = LoggerFactory.getLogger(ResolveTargetPlatformTask.class);

  @TaskAction
  protected void resolveTargetPlatform() {
    Set<File> targetPlatformFiles = getProject().getConfigurations().getByName("targetPlatform").resolve();
    Iterator<File> platformFileIterator = targetPlatformFiles.iterator();
    while(platformFileIterator.hasNext()){
        File file = platformFileIterator.next();
        
    }
  }
}