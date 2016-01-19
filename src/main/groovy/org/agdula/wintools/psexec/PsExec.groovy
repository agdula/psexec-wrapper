package org.agdula.wintools.psexec

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

/**
 * @author: Andrzej Gdula
 * @created: 01/19/2016 15:28 
 * @version: 1.0
 */
@CompileStatic
@Slf4j
class PsExec {
    PsExecConfig cfg

    PsExec(final PsExecConfig cfg) {
        this.cfg = cfg
        def psexec = new File(cfg.binaryLocation).absoluteFile
        if(psexec.exists()){
            log.debug("Using $psexec ",)
        }else{
            log.debug("$psexec not found. Unpacking")
            psexec.bytes = PsExec.class.getResourceAsStream("/PsExec.exe").bytes
        }
    }


}
