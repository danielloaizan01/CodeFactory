import { IStudent } from "./student-interface";
export interface GroupInterface {
  code: string;
  courseId: number;
  groupId: number;
  professorId: number;
  students: IStudent[];
}