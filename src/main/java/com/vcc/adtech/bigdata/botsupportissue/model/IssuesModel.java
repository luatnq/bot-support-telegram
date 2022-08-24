package com.vcc.adtech.bigdata.botsupportissue.model;

public class IssuesModel {

  /**
   * project_id
   * tracker_id
   * status_id
   * priority_id
   * subject
   * description
   * category_id
   * fixed_version_id - ID of the Target Versions (previously called 'Fixed Version' and still referred to as such in the API)
   * assigned_to_id - ID of the user to assign the issue to (currently no mechanism to assign by name)
   * parent_issue_id - ID of the parent issue
   * custom_fields - See Custom fields
   * watcher_user_ids - Array of user ids to add as watchers (since 2.3.0)
   * is_private - Use true or false to indicate whether the issue is private or not
   * estimated_hours - Number of hours estimated for issue
   */
  private long projectId;
  private long trackerId;
  private long statusId;
  private long priorityId;
  private String subject;
  private String description;
  private long assignedToId;


  public long getProjectId() {
    return projectId;
  }

  public void setProjectId(long projectId) {
    this.projectId = projectId;
  }

  public long getTrackerId() {
    return trackerId;
  }

  public void setTrackerId(long trackerId) {
    this.trackerId = trackerId;
  }

  public long getStatusId() {
    return statusId;
  }

  public void setStatusId(long statusId) {
    this.statusId = statusId;
  }

  public long getPriorityId() {
    return priorityId;
  }

  public void setPriorityId(long priorityId) {
    this.priorityId = priorityId;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  public long getAssignedToId() {
    return assignedToId;
  }

  public void setAssignedToId(long assignedToId) {
    this.assignedToId = assignedToId;
  }

  @Override
  public String toString() {
    return "IssuesModel{" +
        "projectId=" + projectId +
        ", trackerId=" + trackerId +
        ", statusId=" + statusId +
        ", priorityId=" + priorityId +
        ", subject='" + subject + '\'' +
        ", description='" + description + '\'' +
        ", assignedToId=" + assignedToId +
        '}';
  }
}
