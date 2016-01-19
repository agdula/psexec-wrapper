package org.agdula.wintools.psexec

import groovy.transform.CompileStatic
import groovy.transform.builder.Builder

/**
 * @author: Andrzej Gdula
 * @created: 01/19/2016 15:30 
 * @version: 1.0
 */
@CompileStatic
@Builder
class PsExecConfig {
    String binaryLocation = System.getProperty("org.agdula.wintools.psexec.binary",
            System.getProperty("java.io.tmpdir")+"/PsExec.exe");
}
