package hello.spring.cloud.job.admin.dao;

import hello.spring.cloud.job.admin.core.model.XxlJobInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * job info
 * @author xuxueli 2016-1-12 18:03:45
 */
@Mapper
public interface XxlJobInfoDao {

	public List<XxlJobInfo> pageList(@Param("offset") int offset,
									 @Param("pagesize") int pagesize,
									 @Param("jobGroup") int jobGroup,
									 @Param("triggerStatus") int triggerStatus,
									 @Param("jobDesc") String jobDesc,
									 @Param("executorHandler") String executorHandler);
	public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize,
                             @Param("jobGroup") int jobGroup,
                             @Param("triggerStatus") int triggerStatus,
                             @Param("jobDesc") String jobDesc,
                             @Param("executorHandler") String executorHandler);
	
	public int save(XxlJobInfo info);

	public XxlJobInfo loadById(@Param("id") int id);
	
	public int update(XxlJobInfo xxlJobInfo);
	
	public int delete(@Param("id") int id);

	public List<XxlJobInfo> getJobsByGroup(@Param("jobGroup") int jobGroup);

	public int findAllCount();

	public List<XxlJobInfo> scheduleJobQuery(@Param("maxNextTime") long maxNextTime);

	public int scheduleUpdate(XxlJobInfo xxlJobInfo);


}
