package com.thalesgroup.gradle.pde.tasks.product

import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskAction
import com.thalesgroup.gradle.pde.ProductPdeBuild
import org.gradle.api.Action

/**
 * Created by IntelliJ IDEA.
 * User: Rene
 * Date: 14.01.2010
 * Time: 20:53:42
 * To change this template use File | Settings | File Templates.
 */
class AssembleTargetPlatform extends Copy {
  public AssembleTargetPlatform() {
    //dependsOn(ProductPdeBuild.RESOLVE_TARGET_PLATFORM_TASK_NAME);
    setDescription "assembles the eclipse targetplatform used by pdeBuild"
    Set<File> files = new HashSet<File>();
    dependsOn(ProductPdeBuild.RESOLVE_TARGET_PLATFORM_TASK_NAME);
    //configure{
      setDestinationDir(new File("${getProject().getBuildDir().absolutePath}/targetPlatform/"))
      //files.add(new File("/Users/Rene/.gradle/cache/eclipse/zips/eclipse-3.5.1-delta-pack.zip"));
              //project.configurations.getByName("targetPlatform").resolve()
    //}

    //files = project.configurations.targetPlatform.collect {File file -> file.name};
          
    //into(new File("${getProject().getBuildDir().absolutePath} ${System.getProperty("file.separator")}targetPlatform/")){
      files.each {
        from(project.configurations.targetPlatform)
        //from(project.zipTree(it.absolutePath));
      }

  }
}