import { GroupInterface } from "./group-interface";

export interface CourseInterface {
  id: number;
  code: string;
  groups: GroupInterface[];
  credit: number;
  name: string;
}
