package com.dianping.pigeon.monitor.trace.stats;

import com.dianping.pigeon.monitor.trace.data.MonitorData;

/**
 * @author qi.yin
 *         2016/11/21  上午12:36.
 */
public interface AllTraceData<M extends MonitorData> {

    void start(M monitorData);

    void addData(M monitorData);

    void complete(M monitorData);

    void reset();

    AllTraceData copy();
}
