import React from 'react';
import ReactDOM from 'react-dom/client';
import TaskManagementPage from './components/task-manager-page';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <TaskManagementPage/>
  </React.StrictMode>
);

